"use client";

import { useParams } from "next/navigation";
import client from "@/lib/backend/client";
import type { paths } from "@/lib/backend/apiV1/schema";
import { useEffect, useState } from "react";

export default function Page() {
  const { id } = useParams();
  const [post, setPost] = useState<
    | paths["/api/v1/posts/{id}"]["get"]["responses"]["200"]["content"]["application/json"]
    | null
  >(null);

  useEffect(() => {
    client.GET(`/api/v1/posts/${id}`, {}).then((res) => {
      setPost(res.data);
    });
  }, [id]);

  return (
    <div>
      <h1>{post?.subject}</h1>
      <div>{post?.body}</div>
    </div>
  );
}
