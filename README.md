# Branch, Merge, Ship

A practice repository for the Branch, Merge, Ship Git & GitHub course on Java Pro Academy.

https://www.javapro.academy/free-git-github-course/git-fundamentals/installing-and-configuring-git

#### What Is This?

This repo contains three Java files, each with an intentional bug. As you work through the course, you'll fork this repo, fix the bugs one at a time, and open pull requests. CI validates every fix automatically.

#### The Bugs

| File | What's Wrong | CI Check |
|------|-------------|----------|
| src/Calculator.java | subtract() adds instead of subtracting | ❌ Failing |
| src/Greeting.java | greet() says "Goodbye" instead of "Hello" | ❌ Failing |
| src/Weather.java | Hot and Cold labels are swapped | ❌ Failing |

#### Getting Started

1. Fork this repository (click the Fork button above)
2. Clone your fork:
   ```bash
   git clone git@github.com:YOUR-USERNAME/branch-merge-ship.git
   ```
3. Follow the course lessons to fix each bug

#### Course Lessons That Use This Repo

- Lesson 3.3 — Fork and clone this repo
- Lesson 3.4 — Fix Calculator.java, open your first PR
- Lesson 4.1 — Fix Greeting.java using the feature branch workflow
- Lesson 5.4 — Fix Weather.java, tag your release

#### License

MIT — see LICENSE file for details.