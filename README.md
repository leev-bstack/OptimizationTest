# Optimization test repo

Repo for demonstrating Selenium command Optimization

![BrowserStack Logo](https://d98b8t1nnulk5.cloudfront.net/production/images/layout/logo-header.png?1469004780)

## Install repo

---
- Clone the repo
- Set your [BrowserStack Username and Access Key](https://www.browserstack.com/accounts/settings) in the browserstack.yml files or set BROWSERSTACK_USERNAME and BROWSERSTACK_ACCESS_KEY as environmental variables

## You can run any of the following scenerios

---

1. Run a non-optimized test (NonOptimized.java) on a local chromedriver
```
mvn test -P local-non
```
2. Run an optimized test (Optimized.java) on a local chromedriver
```
mvn test -P local-opt
```
3. Run a non-optimized test (NonOptimized.java) on BrowserStack.
```
mvn test -P bstack-non
```
3. Run an optimized test (Optimized.java) on BrowserStack
```
mvn test -P bstack-opt
```
5. Run both on BrowserStack
```
mvn test -P bstack-both
