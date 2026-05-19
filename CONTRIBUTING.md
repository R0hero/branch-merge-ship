# Contributing

This repository is part of the **Branch, Merge, Ship** course on [Java Pro Academy](https://www.javapro.academy). Each Java file has an intentional bug. Your job is to fix them — one bug per branch, one branch per pull request.

## Workflow

1. **Fork** this repository to your GitHub account
2. **Clone** your fork locally
3. **Create a branch** for the bug you're fixing (e.g., `fix/calculator-subtract`)
4. **Fix the bug** in the source file
5. **Commit** with a conventional commit message (e.g., `fix: correct subtract method`)
6. **Push** your branch to your fork
7. **Open a pull request** against this repository's `main` branch

## Bugs to Fix

| File | Bug | Expected Fix |
|------|-----|-------------|
| `src/Calculator.java` | `subtract()` adds instead of subtracting | Change `a + b` to `a - b` |
| `src/Greeting.java` | `greet()` says "Goodbye" | Change "Goodbye" to "Hello" |
| `src/Weather.java` | Hot and Cold labels are swapped | Swap the return values |

## CI Validation

Each file has its own CI check. When you push a fix, the corresponding check turns green. Your goal is to make all three checks pass by the end of the course.

## Branch Naming

Use these prefixes:

- `fix/` — for bug fixes (e.g., `fix/calculator-subtract`)
- `feat/` — for new features
- `docs/` — for documentation changes

## One Bug Per PR

Fix one bug per branch and one branch per pull request. Keep PRs small and focused.