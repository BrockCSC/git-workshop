# Intro
This is a little guide to help you get introduced to using git with GitKraken

#Part 0: Setup
1. Install git: https://git-scm.com/download
2. Set user info using the command line
    * `git config --global user.email "you@example.com"`
    * `git config --global user.name "Your Name"`
3. Create your github account with your Brock email: https://github.com/
4. Get your github education pack: https://education.github.com/pack
5. Install GitKraken: https://www.gitkraken.com/download
6. Sign into GitKraken using your Github account

# Part 1: Working Locally
1. Open GitKraken
2. Click (2) in the top left corner to initialize a new repository.
3. Go to Init, and create a "Local Only" repository. Create a folder called "git-stuff" and set it as your "New repository path". Click "Create Repository"
4. Create a text file in the "git-stuff" folder. (A "README.md" is automatically created for you)
5. In GitKraken, click "// WIP" in the center window.
6. Click the green button that says "Stage all changes"
7. Type a message in the "Commit message" section.
8. Click "Commit changes to 1 file" button.
9. Your commit was added to the tree in the center of GitKraken.
10. Open the file you created and type in "Hello World". Save and close the file.
11. In GitKraken, you can inspect the file and see the changes that were made.
12. While inspecting, click "Stage File".
13. The file has now moved to the "Staged Files" section.
14. Type a messsage and commit.

# Part 2: Working with Github
1. Go to github and create a new project: https://github.com/new
2. Name it something descriptive, and make it private (So you can control who sees it), then click "Create repository"
3. Copy the url in "Quick Setup"
4. Go to GitKraken and click the "Green Plus" button that appears when you hover over "REMOTE" on the left.
5. Click "URL". Enter the name you want to commit with. Paste the URL you copied into "Pull URL" and "Push URL". Then click "Add Remote"
6. Click "Push" at the top. Click "Submit".
7. Refresh the github page and you will see your repo there.
8. Locally, add a new file, and put some text in it.
9. Add it to your repo and commit it.
10. Click the "Push" button.
11. Your changes will now be on Github.
12. On Github, click "Create new file". Name it something, and give it some contents.
13. On GitKraken, click the "Pull" button.
14. Now your local repo is up to date.

