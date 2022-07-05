package variousConcepts;
/*

TOOLS FOR DEVELOPMENT:
- ALM/TestRail: 
  A test case management tool that acts as a repository of manual test cases. Able to do test runs, reports and integration with automation. 
- Jira/ADO/AWS:
  A project management tool comprised of work units, backlogs, team 	boards, stories, tickets etc. Entire company uses it.
- GitHub/BitBucket:
  An online cloud code repository website.
- Jenkins:
  A cloud code run with headless browser and collaborative report tool.

WHAT IS GIT HUB?
It is an online cloud code repository website, where we can save our code. Whatever code we do as a team we save it there, like a bank of
codes. How does it work? Let's say there are 3 different developers, one does Login test, another does Customer and the third one is doing
List customer. After doing the codes they all push the codes together to GitHub and make one code framework. The developers also can pull
back the codes from the GitHub.

Jenkins is another powerful tool, which can run the framework of stream by itself automatically. How it works? We get the codes from GitHub
and define a time (mostly middle of night), we run the codes and in the morning the report will be ready, if failed we go and fix it.

4 things we need to define in order to setup a Jenkins, it called Jenkins Job and sometimes they call it Pipeline (During interview say Job
or Jenkins Job).
- SOURCE:
  it can be local or GitHub.
- TRIGGER:
  The triggers directive defines the automated ways in which the Pipeline should be re-triggered. Depending on type of framework we can 
  define it, within Jenkins it runs on a headless browser. A headless browser is a web browser with no user interface (UI) whatsoever. Instead, 
  it follows instructions defined by software developers in different programming languages. Headless browsers are mostly used for running 
  automated quality assurance tests, or to scrape websites. Headless browser is something that is on the  code and when you go over it with 
  cursor it shows a window with infos. Every web driver has its own headless browser, the most common ons PhantomJS, which is a headless 
  browser used for automating web page interaction.
- TIME:
  defines a time for trigger.
- REPORTING: reports the pass or fail.

*Source, Trigger and Time = Pre build
*Reporting 	= Post build

Jenkins is within the server, so we have to go inside server inorder to build the Pipeline. Some companies asks Dev Ops (Developer Operation)
to do it, since they don't have knowledge of test, they may need QAs help.
Now a days they call SDET (Software development engineer in test), the job for SDET is to know Manual Test, Automation Test, and Dev Ops
work to create the pipeline for Jenkins.

WHAT IS GIT?
Git is a version control system that lets you manage and keep track of your source code history. Multiple developers will be designing one single 
framework and trough GIT, it helps coordination between them and trucks the changes. We usually see the software updates, sometimes this updates 
changes the whole platform like, going from windows 8 to windows 10 or 11. But sometimes there is only small changes and not the whole thing. 
Small small changes by each developer, so it's changing the version of the actual framework, like version 2.1 to 2.2 or 2.1.1. And everytime the 
developer pushes the code it tells at what time, what day and by whom added, so it all truckable.
- It has a repository or repo to store codes 
- GIT is a Version Control System
- Used to coordinate work between multiple developers
- It helps in tracking changes in source code during software development


GitHub:
What is the difference between Git and GitHub?
Git is a version control system that lets you manage and keep track of your source code history. GitHub is a cloud-based hosting service that 
lets you manage Git repositories. If you have open-source projects that use Git, then GitHub is designed to help you better manage them. 
If we look at the banking concept, we can deposit, withdraw, mortgage and many more services. Also there is many banks like chase, capital one,
bank of America, which they all offer same concepts. Same thing in here, Git is the concept and GitHub is the company that offers the service. 

- GitHub is a website or Web based software
- Open source 
- It is a GIT repository hosting service
- Version Control Platform


GitHub competitors:
- GitLab
- TFS (Microsoft Team Foundation Server) 
- Bitbucket
- AWS CodeCommit
- Mercurial
- And others…


Keywords:
- Local									=> Our Computer
- Origin (Remote)						=> Repository
- Brunch(s): Master & Feature			=> Master Branch/Main/Develop
- Check-in & Check-out / PULL & PUSH
- GIT CLONE								=> Pulling the code for the fist time
- PR – PULL REQUEST 

Links:
- https://github.com/
- https://desktop.github.com/
================================================================================================================================================
In order to know if we have GitHub installed in our machine, go to any folder in File Explorer, right click inside the folder, show more options
and look for Git Bash. If don't have then follow these steps,
- Open your web browser, and go to https://git-scm.com/downloads
- Click the Download button on the monitor image
- Click on the downloaded exe file
- Continue clicking next until installation starts
- Click finish when done
================================================================================================================================================
** FOR EACH AND EVERY AUTOMATED SCENARIOS YOU HAVE TO CREATE A NEW BRANCH!!!

How to Push and Pull Files:
- Go to the location of your folder/project you want to share or push, go inside the project, right click on any white space, click on more option,
  click on GitBash here.

** IN FILE EXPLORER, CLICK ON 3 DOTS (TOP), CLICK ON OPTIONS, GO TO VIEW TAB, CLICK ON SHOW HIDDEN FILES** (this part has nothing with push/pull).

Now, the first thing we have to do is to initialize our Git to the project,
	git status(enter)
Now we can add files in 2 ways, individually and the whole project. to do individually,
	git add fileName(enter) //or the whole project,
	git add .(enter) // putting to staging area
to see the changes,
	git status(enter)
We will see a message (use"git rm--cashed <file> to unstage), what is TO UNSTAGE means in here? when we do Git add, whatever file we have, we are 
staging them to put it to the Git to the remote. It will be in green print. There are 3 different names for the staging area and all doing same,
to index / staging area / working tree. Now let's commit it,
	git commit -m "anyMessage"(enter)
(-m stands for message, usually we pass the test case name as message, for easy understand. We can use "-m OR -r OR -rm" all work same).
Now all files will show in white print, again to check the status,
	git status(enter)
and will see "nothing to commit, working tree clean"

CODES:
- git init			//Initialize local Git Repository
- git add . 		//Add edited File(s) to Index/Staging area/Working Tree
- git status		// Check Status of Working Tree
- git commit -m		// Save changes in Index
- git push			// Send Local Master (code) to Remote Repository
- git pull			// Update local (code) with Remote/Origin Master
- git clone			// Copy a Origin Master (code) in to local for the first time

- Create new branch:  				git branch new branch name
- Switch between Branches: 			git checkout branch name
- Create new branch and switch: 	git checkout -b branch name
- Connect to Remote: 				git remote add origin url (from github site)
- Clone Master:	 					git clone url (from github site) 
- Merge: 							git merge branch name 
- Push code:						git push –u origin branch name
- Pull from Master:					git pull origin master
================================================================================================================================================
If you see the message "tell me who you are" means your email and username is needed for GitBash in order to work, it comes with a 2 line 
explanation, simply copy the first line "git config--blobal user.eamil you@example.com" and paste it to the bottom of the GitBash and put your
email address instead of "you@example.com", then go outside of double quote and hit the Enter. Same thing with the second line copy "git 
config--blobal user.name "your name", go outside quotation and enter. And just commit it again,
	git commit -m "any messge"(enter)	//pushing
=================================================================================================================================================
Next step would be, open the GitHub page (gethub.com) sign in to your account, now we need to create and account to push our code. 2 ways to do,
- click on New Repository icon on left top, or
- click on + on right top and click on New Repository.
new page will open and ask for a Repository Name, give a name like, 1stProject-Feb2022, click on public and go all the way to the end and hit
Create Repository. The new page will open with infos, there it shows how far we went. Our code is ready to push up. The next job is to create a
bridge between local master and this repository. Copy the code line and take it to GitBash,
	git remote add origin http://github.com/techfios-git/1stProject-Feb2022.git
(the black screen GitBash is our local and the GitHub page is our remote/Repository, and we want a bridge between them), paste the code and Enter.

Now copy the code or write,
	git push -u origin master(enter)
Now refresh the page and you will see the files that you have pushed up.
=================================================================================================================================================
If you see a message that asks to login to your account, do so and click on Authorize Git Credential Manager. Go back to GitBash and it will work.
==================================================================================================================================================

How to do Clone for the first time?
On remote Git we see a green button (code), click on it, it gives you a link and copy the link. Create a folder inside Selenioum folder in Desktop,
name it Git Clone. Go inside it and bring the GitBash there (right click, more options and GitBash here), type git space clone and paste the code 
we copied from Repository and Enter,
	git clone hppt://github.com/......(enter)
it will bring the whole project.



How to get existing Maven project in to Eclipse?
- Open Eclipse.
- Click File > Import.
- Type Maven in the search box under Select an import source:
- Select Existing Maven Projects.
- Click Next.
- Click Browse and select the folder that is the root of the Maven project (probably contains the pom.xml file)
- Click Next.
- Click Finish.
=================================================================================================================================================

STEPS to PUSH and PULL:
 Go to folder you want to push, get the git bash there
 	git init(enter) => to initialize git to the project, a new folder will be created
 	git add .(enter) => for the whole folder/project 
 	git add nameOfFile(enter) => for individually
 	
Now we do staging (sending to remote/repository) 3 names for it (to index, staging area, working tree) we use commit
to put the code in to local master, 3 ways to do, with the 'm' is preferred and stands for message
 	git commit -m "any message"(enter)
 	git commit -r "any message"(enter)			
 	git commit -rm "any message"(enter)
 	
Now create a new repository in GitHub, in order to create a bridge between the Remote/Repository and Local Master, copy
the link and take it to Git bash.
	git remote add origin http://github.com/jrustaqi/ClassOne.git(enter) => this link is just an example
	git push -u origin master(enter)
	
Now go to GitHub/Remote/Repository and hit the Refresh to see the project.
=======================================================================================================================

If we assigned any test to automate, the first thing to do is create a new project and switch before doing any
changes, because we don't want to mess up with the master. Every test story has to be identify with an ID, we can use
that ID to name the branch name, Go to that folder (in this case Class1) bring the Git bash and follow, 

To create a new branch,
	git branch CopyClass1(enter) => it still will show that you are in master, to switch it,
	git checkedout CopyClass1(enter)
=======================================================================================================================
Create a new class in eclipse Class1, name it GitTest and main method with a syso, then go back to GitBash 
	git status(enter)	// will show the new class and next step is to add it,
	git add .(enter)
	git commit -m "push2"
	git push -u origin CopyClass1

Now go to GitHub, it shows "the file had recent pushes" and now we need to Pull Request/Merge Request. Click on Compare/
Pull Request, will show the codes we did. We can write in message area something like "please review" and click on "Create
Pull Request". Once it clicked the lead will recieve an email for Review Request. Lead will look for the request, review
it and if no issue found then he/she will go to "Files Changed" tab where she/he can see the codes, if lead is happy with 
the code then goes back to the "Conversation" tab and hit the "Merge Pull Request" and "Confirm Merge".
If we go back to "Code" tab, we see it shows more than one branch, and also if we go inside crs folder, we can find all
our codes in there. Mostly the lead keeps the breaches for 3-6 months before gets deleted.

	
 	
 	
 	


================================================================================================================================================

 */

public class LearnGitHub {

}
