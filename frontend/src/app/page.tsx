"use client";

import { useEffect, useState } from "react";
import client from "@/lib/backend/client";
import type { paths } from "@/lib/backend/apiV1/schema";
import Link from "next/link";
export default function Home() {
  const [posts, setPosts] = useState<
    paths["/api/v1/posts"]["get"]["responses"]["200"]["content"]["application/json"]
  >([]);
  useEffect(() => {
    client.GET("/api/v1/posts").then((res) => {
      setPosts(res.data);
    });
  }, []);

  return (
    <div className="grid grid-rows-[20px_1fr_20px] items-center justify-items-center min-h-screen p-8 pb-20 gap-16 sm:p-20 font-[family-name:var(--font-geist-sans)]">
      <main className="flex flex-col gap-8 row-start-2 items-center sm:items-start">
        <h1>Hello World</h1>
        <ul>
          {posts.map((post) => (
            <li key={post.id}>
              <Link href={`/p/${post.id}`}>{post.subject}</Link>
            </li>
          ))}
        </ul>
      </main>
    </div>
  );
}
