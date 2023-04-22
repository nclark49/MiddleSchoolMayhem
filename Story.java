package main;

import java.util.Random;
import java.util.Scanner;

public class Story {

	static Scanner in = new Scanner(System.in);
	static String textDisplay = "";

	/**public static void main(String args[]) {
		System.out.println(missionText("Bob", 2, 1, "y"));
	}**/

	public static String missionText(String playerName, int scene, int subscene, String input) {
		switch (scene) {
		case 1: // Intro Welcome Script
			textDisplay = ("\n*************************************************************************************************************\n"
					+ "Hello " + playerName
					+ "! Welcome to \"Middle School Mayhem\", a game that takes the chaos of Grand Theft Auto "
					+ "and sets it in the halls of a typical American middle school. In this game, you'll play as a mischievous "
					+ "student looking to cause trouble and make a name for yourself in the schoolyard.\n"
					+ "\n From stealing test answers to pulling off elaborate pranks, you'll have to navigate the school's "
					+ "various factions, including jocks, nerds, and bullies, while avoiding detection from the watchful eyes "
					+ "of teachers, security guards, and hall monitors.\n"
					+ "\nYou'll also have to contend with the various consequences of your actions, including detention, suspension, "
					+ "and even expulsion. But with enough cunning and skill, you might just become the most feared and respected "
					+ "student in the school.\n So buckle up, grab your backpack, and get ready for some Middle School Mayhem!\n"
					+ "\n*************************************************************************************************************");
			System.out.println("Scene 1 Subscene 1");
			break;
		case 2: // Mission One - Steal Test Answers
			switch (subscene) {
			case 1:
				textDisplay = ("\n*************************************************************************************************************"
						+ "\n>>" + playerName + ": What's up, guys?\n"
						+ "\n>>Big D: Hey, loser. We've got a job for you.\n" + "\n>>" + playerName
						+ ": (skeptically) What kind of job?\n"
						+ "\n>>Eddie: We need you to break into the teacher’s lounge and steal the answers to the math test.\n"
						+ "\n>>" + playerName + ": (surprised) Are you serious? That's insane!\n"
						+ "\n>>Big D: (threateningly) You better do it " + playerName
						+ " if you know what's good for you.\n"
						+ "\n*************************************************************************************************************"
						+ "\nDo you accept this mission? Y/N");
				System.out.println("Scene 2 Subscene 1");
				break;
			case 2:
				if (input.equals("Y") || input.equals("y")) { // If the player accepts the mission
					textDisplay = ("\n*************************************************************************************************************"
							+ "\n>>" + playerName
							+ ": (thinking quickly) Okay, okay. I'll do it. But what's in it for me?\n"
							+ "\n>>Big D: You’ll get a reward well worth the risk.\n" + "\n>>" + playerName
							+ ": (sighs) Fine. I'll do it. But how am I supposed to get into the teacher’s lounge?\n"
							+ "\n>>Eddie: I've been working on a hack that can bypass the security system. I'll send you the code.\n"
							+ "\n>>" + playerName
							+ ": (relieved) Okay, that sounds helpful. But what about the hall monitors?\n"
							+ "\n>>Big D: (smirks) Leave that to me, " + playerName
							+ ". I've got a little distraction planned.\n"
							+ "\n*************************************************************************************************************"
							+ "\n*** You set off on your mission breaking into the teacher’s lounge and attempt to steal the test answers. ***"
							+ "\n*************************************************************************************************************");

					Random rand = new Random();
					int missionSuccess = 75; // 75% chance of the player being successful on their mission

					if (rand.nextInt(100) < missionSuccess) { // If the random number is less than 75, then the player
																// is successful!
						textDisplay = textDisplay
								+ "\n*************************************************************************************************************"
								+ "\n****************************************************************************"
								+ "\n*************************** >>>>> SUCCESS <<<<< ****************************"
								+ "\n****************************************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n>>" + playerName + ": (breathlessly) Alright, I've got the answers. Now what?\n"
								+ "\n>>Eddie: (excitedly) Excellent work " + playerName
								+ "! We'll use these to study and get the " + "highest grades in the class!\n"
								+ "\n>>Big D: (impressed) You actually did it, loser. Maybe you're not so useless after all.\n"
								+ "\n*************************************************************************************************************";
					} else // If the random number is more than 75, than the player is not successful
						textDisplay = textDisplay
								+ "\n*************************************************************************************************************"
								+ "\n>>Hall Monitor: What are you doing in here? You're not supposed to be in the teacher's lounge.\n"
								+ "\n>>" + playerName + ": Uh, I was just looking for a lost pencil.\n"
								+ "\n>>Hall Monitor: Nice try. You are coming with me to the principal's office.\n"
								+ "\n*************************************************************************************************************"
								+ "\n*******************************************************************************"
								+ "\n*** You get detention for being in the teacher’s lounge without permission. ***"
								+ "\n*******************************************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n>>Big D: So, did you get the answers to the math test like I asked?\n" + "\n>>"
								+ playerName + ": Uh, no. I didn't, actually.\n"
								+ "\n>>Big D: What do you mean you didn't? I specifically asked you to get the answers.\n"
								+ "\n>>" + playerName
								+ ": Well, I tried, but I got caught by one of the Hall Monitors.\n"
								+ "\n>>Big D: You got caught? Are you kidding me " + playerName
								+ "? I thought I could count on you.\n" + "\n>>" + playerName
								+ ": I’m really sorry. I didn't mean to let you down.\n"
								+ "\n>>Big D: Sorry doesn't cut it. I needed those answers to pass the test.\n" + "\n>>"
								+ playerName + ": Maybe I can try again next time?\n"
								+ "\n>>Big D: No, I don't think so " + playerName
								+ ". I don't want to take any more chances. I'll just have "
								+ "to figure something else out.\n" + "\n>>" + playerName
								+ ": I understand. I’ll do better next time, I promise.\n"
								+ "\n>>Big D: I hope so. If you want to be part of my crew, you're going to have to step up your game.\n"
								+ "\n*************************************************************************************************************";
				} else if (input.equals("N") || input.equals("n")) { // If the player does not accept the mission
					textDisplay = "\n*************************************************************************************************************"
							+ "\n>>" + playerName + ": Sorry, but that’s one mission I can’t do.\n"
							+ "\n>>Big D: Stop being such a buzzkill. We could’ve used a kid like you and I thought we could count on you.\n"
							+ "\n>>" + playerName
							+ ": I'm not trying to be a buzzkill, I just can’t take the risk right now.\n"
							+ "\n>>Big D: Fine, if you're not in, I'll just find someone else to do it for me.\n"
							+ "\n*************************************************************************************************************";
				}
				System.out.println("Scene 2 Subscene 2");
				break;
			}
			break;
		case 3: // Mission Two - Sabotage Science Fair
			switch (subscene) {
			case 1:
				textDisplay = ("\n*************************************************************************************************************"
						+ "\n>>" + playerName + ": Hey guys, what's going on?\n" + "\n>>Big D: " + playerName
						+ ", we need your help with something.\n" + "\n>>" + playerName
						+ ": (skeptically) What kind of help?\n"
						+ "\n>>Biff: We need you to sabotage the project of our biggest rival in the science fair.\n"
						+ "\n>>" + playerName + ": (confused) Why? What did they do to you?\n"
						+ "\n>>Big D: (angrily) They're always showing off with their fancy projects and getting all the attention.\n"
						+ "\n>>Biff: (whining) And they got me suspended, I want them to pay!\n" + "\n>>" + playerName
						+ ": (doubtful) I don't know guys, this sounds pretty risky.\n"
						+ "\n>>Big D: (threateningly) You don't have a choice, " + playerName
						+ ". You're either with us or against us.\n"
						+ "\n>>Biff: (imploringly) Please, we need this win. It's our only chance to get revenge for them getting me "
						+ "suspended last month!\n"
						+ "\n*************************************************************************************************************"
						+ "\nDo you accept this mission? Y/N");
				System.out.println("Scene 3 Subscene 1");
				break;
			case 2:
				System.out.println("Scene 3 Subscene 2");
				if (input.equals("Y") || input.equals("y")) { // If the player accepts the mission
					textDisplay = ("\n*************************************************************************************************************"
							+ "\n>>" + playerName
							+ ": (reluctantly) Alright, fine. But how am I supposed to sabotage their project?\n"
							+ "\n>>Biff: I've been spying on them and they are creating a really impressive volcano. We want to tamper "
							+ "with their activating ingredient. Instead of an eruption of lava, it will be an explosion! I have the "
							+ "ingredient here in my locker.\n"
							+ "\n>>Big D: (smirks) And I'll create a distraction to keep the teachers busy.\n"
							+ "\n**************************************************************************************************************************"
							+ "\n*** You set off on your mission and attempt to sabotage the rival team's project and ensuring your own team's victory. ***"
							+ "\n**************************************************************************************************************************");

					Random rand = new Random();
					int missionSuccess = 75; // 75% chance of the player being successful on their mission

					if (rand.nextInt(100) < missionSuccess) { // If the random number is less than 75, then the player
																// is successful!
						textDisplay = textDisplay
								+ "\n*************************************************************************************************************"
								+ "\n****************************************************************************"
								+ "\n*************************** >>>>> SUCCESS <<<<< ****************************"
								+ "\n****************************************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n>>" + playerName
								+ ": (breathlessly) Alright, I did it. The rival team's project is toast.\n"
								+ "\n>>Biff: (gleefully) Excellent work! We're going to win the science fair!\n"
								+ "\n>>Big D: (impressed) Not bad, " + playerName
								+ ". Maybe you're not so useless after all.\n"
								+ "\n*************************************************************************************************************";
					} else // If the random number is more than 75, than the player is not successful
						textDisplay = textDisplay
								+ "\n*************************************************************************************************************"
								+ "\n>>Teacher: Hey, " + playerName
								+ " what are you doing with that bottle of vinegar near the volcano project?\n" + "\n>>"
								+ playerName + ": Uh, I was just looking at it. I'm not doing anything.\n"
								+ "\n>>Teacher: It doesn't look like you're just looking at it. You're trying to pour something into the volcano, "
								+ "aren't you?\n" + "\n>>" + playerName
								+ ": Okay, fine. I was trying to sabotage the project. But it wasn't my idea. "
								+ "Someone asked me to do it.\n" + "\n>>Teacher: Who asked you to do this?\n" + "\n>>"
								+ playerName + ": I can't tell you. I promised I wouldn't say anything.\n"
								+ "\n>>Teacher: You realize that cheating and sabotaging are not acceptable in the science fair or anywhere else, right? "
								+ "You are in serious trouble for this.\n"
								+ "\n**********************************************************************************************************************"
								+ "\n*** You get disqualified from the science fair and got detention for trying to sabotage another student’s project. ***"
								+ "\n**********************************************************************************************************************"
								+ "\n>>Big D: Hey " + playerName
								+ ", did you manage to sabotage the volcano project at the science fair?\n" + "\n>>"
								+ playerName
								+ ": I tried, but I got caught. A teacher saw me trying to pour vinegar into the volcano "
								+ "and they disqualified me from the fair and gave me detention.\n"
								+ "\n>>Big D: Are you serious? You couldn't even do this one simple thing for me?\n"
								+ "\n>>" + playerName
								+ ": I'm sorry. I tried, but got caught. You didn’t tell me there would be teachers "
								+ "monitoring everywhere in the gym!\n"
								+ "\n>>Big D: Of course the teachers would be there. I figured you were smart enough to avoid them.\n"
								+ "\n>>Biff: You're not getting paid for this mission.\n" + "\n>>" + playerName
								+ ": That's okay. I understand.\n"
								+ "\n>>Big D: You better watch yourself. You never know when I might need someone to do a job for me. Don't "
								+ "think I will forget this.\n"
								+ "\n*************************************************************************************************************";
				} else if (input.equals("N") || input.equals("n")) { // If the player does not accept the mission
					textDisplay = "\n*************************************************************************************************************"
							+ "\n>>" + playerName + ": Sorry, but that’s one mission I can’t do.\n"
							+ "\n>>Big D: Stop being such a buzzkill. We could’ve used a kid like you and I thought we could count on you.\n"
							+ "\n>>" + playerName
							+ ": I'm not trying to be a buzzkill, I just can’t take the risk right now..\n"
							+ "\n>>Big D: Fine, if you're not in, I'll just find someone else to do it for me.\n"
							+ "\n*************************************************************************************************************";
				}
				break;
			}
			break;
		case 4: // Mission Three - Change a Student's Grade
			switch (subscene) {
			case 1:
				textDisplay = ("\n*************************************************************************************************************"
						+ "\n>>Big D: Ah, just the student I was looking for. I heard you're pretty good with computers. I was wondering "
						+ "if you could help me out with something.\n" + "\n>>" + playerName + ": What do you need?\n"
						+ "\n>>Big D: Well, it's come to my attention that one of the kids in our crew has been struggling in math, "
						+ "and their grade is very low. I need you to help me change their grade from a F to an A before report cards are printed.\n"
						+ "\n>>" + playerName + ": Change their grade? Is that even legal?\n"
						+ "\n>>Big D: Don't worry, I've already taken care of the technical details. All you need to do is use your "
						+ "computer skills to access the school's grading system and make the change. And in return, I can offer you a reward.\n"
						+ "\n>>" + playerName + ": I don't know, this seems kind of risky. What if I get caught?\n"
						+ "\n>>Big D: Trust me, " + playerName
						+ ", no one will suspect a thing. And think of how happy the kid’s parents "
						+ "will be when they see their improved grade. Plus, you'll be doing a good deed and helping someone out.\n"
						+ "\n*************************************************************************************************************"
						+ "\nDo you accept this mission? Y/N");
				System.out.println("Scene 4 Subscene 1");
				break;
			case 2:
				if (input.equals("Y") || input.equals("y")) { // If the player accepts the mission
					textDisplay = ("\n*************************************************************************************************************"
							+ "\n>>" + playerName + ": Alright, I'll do it. But only because I want to help our crew.\n"
							+ "\n>>Big D: Great, I knew I could count on you. You’ll need to use the computer in the main office. Here's the login "
							+ "information for the grading system. Get to work and make that grade change happen.\n"
							+ "\n*************************************************************************************************************************"
							+ "\n*** You take the login information and head off to try to change the student's grade before report cards are printed. ***"
							+ "\n*************************************************************************************************************************");

					Random rand = new Random();
					int missionSuccess = 75; // 75% chance of the player being successful on their mission

					if (rand.nextInt(100) < missionSuccess) { // If the random number is less than 75, then the player
																// is successful!
						textDisplay = textDisplay
								+ "\n*************************************************************************************************************"
								+ "\n****************************************************************************"
								+ "\n*************************** >>>>> SUCCESS <<<<< ****************************"
								+ "\n****************************************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n>>Big D: Well? How’d it go?\n" + "\n>>" + playerName
								+ ": The kid has an A in math now, just like you wanted.\n"
								+ "\n>>Big D: Very good, looks like your computer skills weren’t just a rumor! As a thank you, and for "
								+ "your trouble, here’s your reward.\n"
								+ "\n*************************************************************************************************************";
					} else // If the random number is more than 75, than the player is not successful
						textDisplay = textDisplay + "\n>>Security guard: Hey! Do you have permission to be in here?\n"
								+ "\n>>" + playerName + ": Uh… Mr Smith sent me in here for something…\n"
								+ "\n>>Security guard: Oh yeah? What exactly, is that something?\n" + "\n>>"
								+ playerName + ": He needed me to print out the study guides for the quiz tomorrow.\n"
								+ "\n>>Security guard: Nice try. Mr Smith is on the class trip with the debate team. I know you’re not supposed "
								+ "to be in here. Come with me!\n"
								+ "\n*************************************************************************************************************"
								+ "\n*******************************************************************************"
								+ "\n*** You get detention for sneaking into the main office without permission. ***"
								+ "\n*******************************************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n>>Big D: What happened " + playerName
								+ "? I didn’t hear back from you yesterday.\n" + "\n>>" + playerName
								+ ": A security guard caught me in the office and didn’t have a good enough explanation "
								+ "for being there. I got detention.\n"
								+ "\n>>Big D: How could you have gotten caught? That’s too bad you got detention, but the kid in our crew with "
								+ "the bad math grade will have it worse. I don’t know if you’ve got the right skills for our crew. I’ll give "
								+ "you another chance, but I’m not holding my breath…"
								+ "\n*************************************************************************************************************";
				} else if (input.equals("N") || input.equals("n")) { // If the player does not accept the mission
					textDisplay = "\n*************************************************************************************************************"
							+ "\n>>" + playerName
							+ ": I appreciate the offer, but I don't want to risk getting caught and facing consequences "
							+ "that could impact my future.\n" + "\n>>Big D: Suit yourself " + playerName
							+ ". Just remember, if you ever need something done, don't come asking " + "me for help.\n"
							+ "\n>>" + playerName + ": That's okay. I understand.\n"
							+ "\n>>Big D: Whatever. I'll find someone else to do this job for me."
							+ "\n*************************************************************************************************************";
				}
				System.out.println("Scene 4 Subscene 2");
				break;
			}
			break;
		case 5: // Mission Four - Pull the Fire Alarm
			switch (subscene) {
			case 1:
				textDisplay = ("\n*************************************************************************************************************"
						+ "\n>>Big D: (anxiously) We have a problem. The history teacher is giving a surprise test today, and we aren't "
						+ "prepared for it.\n" + "\n>>" + playerName + ": (concerned) What can I do to help?\n"
						+ "\n>>Big D: (confidentially) We need you to pull the fire alarm and evacuate the school. That way, we won't have "
						+ "to take the test.\n" + "\n>>" + playerName
						+ ": (hesitantly) I don't know if that's a good idea. What if someone gets hurt?\n"
						+ "\n>>Big D: (urgently) We'll make sure everyone is safe. It's the only way to help these students out."
						+ "\n*************************************************************************************************************"
						+ "\nDo you accept this mission? Y/N");
				System.out.println("Scene 5 Subscene 1");
				break;
			case 2:
				System.out.println("Scene 5 Subscene 2");
				if (input.equals("Y") || input.equals("y")) { // If the player accepts the mission
					textDisplay = ("\n*************************************************************************************************************"
							+ "\n>>" + playerName + ": Seems risky, but I think I can do it.\n"
							+ "\n>>Big D: That’s what I was hoping you’d say! You are really helping us out. I’ll make sure your reward "
							+ "is a good one!"
							+ "\n***************************************************************************************"
							+ "\n*** You set off on your mission, making your way to the fire alarm and pulling it. ****"
							+ "\n********* Chaos erupts as students and teachers begin evacuating the school. **********"
							+ "\n***************************************************************************************");

					Random rand = new Random();
					int missionSuccess = 75; // 75% chance of the player being successful on their mission

					if (rand.nextInt(100) < missionSuccess) { // If the random number is less than 75, then the player
																// is successful!
						textDisplay = textDisplay
								+ "\n*************************************************************************************************************"
								+ "\n****************************************************************************"
								+ "\n*************************** >>>>> SUCCESS <<<<< ****************************"
								+ "\n****************************************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n>>Big D: (grateful) Thank you for your help. You managed to evacuate the school right when the teacher was "
								+ "handing out the test.\n" + "\n>>" + playerName
								+ ": (uncertain) I'm not sure if that was the right thing to do. What if someone finds out?\n"
								+ "\n>>Big D: (reassuringly) Don't worry, we'll make sure you're not implicated. And more importantly, you helped"
								+ " these students out of a tough situation. As a thank you, here’s your reward."
								+ "\n*************************************************************************************************************";
					} else // If the random number is more than 75, than the player is not successful
						textDisplay = textDisplay + "\nTeacher: Hey kid! I caught you red-handed!\n" + "\n>>"
								+ playerName
								+ ": It wasn’t me, I saw it was pulled and walked over to see who was nearby.\n"
								+ "\n>>Teacher: I’m not buying it. You are the only one here, everyone else is in class. This is a serious crime. I "
								+ "think we’ll have a talk with the principal and your parents. You are looking at suspension!!\n"
								+ "\n***************************************************************"
								+ "\n*** You get suspended for 3 days for pulling the fire alarm ***"
								+ "\n***************************************************************"
								+ "\n>>Big D: Man, heard you got caught and got suspended for it. The worst part is when the teachers found "
								+ "out you pulled the fire alarm, they sent everyone back to class and we had to take the test! We all failed! "
								+ "Sorry you got in trouble, " + playerName
								+ ", but I’m not paying you for failing your mission.\n" + "\n>>" + playerName
								+ ": Yeah, well, the reward is the least of my worries. I got in major trouble for this.\n"
								+ "\n>>Big D: Maybe next time you’ll be more careful.\n"
								+ "\n*************************************************************************************************************";
				} else if (input.equals("N") || input.equals("n")) { // If the player does not accept the mission
					textDisplay = "\n*************************************************************************************************************"
							+ "\n>>" + playerName
							+ ": Sorry, but pulling a fire alarm is serious. I could even go to jail.\n"
							+ "\n>>Big D: Stop being so dramatic, you wouldn’t go to jail.\n" + "\n>>" + playerName
							+ ": No is my final answer.\n"
							+ "\n>>Big D: What a disappointment. I thought you were the kid for the job. I guess I’ll have to find someone who "
							+ "is not a square. I’ll remember that you left us high and dry.\");\n"
							+ "\n*************************************************************************************************************";
				}
				break;
			}
			break;
		case 6: // Mission Five - Sneak into Senior Prom
			switch (subscene) {
			case 1:
				textDisplay = ("\n*************************************************************************************************************"
						+ "\n>>Big D: (excitedly) Hey guys, have you heard about the senior prom?\n" + "\n>>"
						+ playerName + ": (sarcastically) Oh yeah, because we're totally seniors.\n"
						+ "\n>>Eddie: (dreamily) I wish I could go to prom.\n"
						+ "\n>>Big D: (determinedly) Well, why can't we? We can sneak in.\n" + "\n>>" + playerName
						+ ": (disbelievingly) Are you crazy? How are we supposed to sneak in?\n"
						+ "\n>>Big D: (confidently) I've heard there's a back entrance that the caterers use. "
						+ playerName + ", you can dress "
						+ "up as a caterer and sneak in that way. Then once you’re in, let us in through the side door of the gym.\n"
						+ "\n>>" + playerName
						+ ": (anxiously) But I’ll get caught. The teachers will know I’m not a caterer.\n" + "\n"
						+ ">>Big D: (reassuringly) Don't worry, we'll be careful. You'll blend in with the other caterers and we’ll all act "
						+ "like we belong there.\n"
						+ "\n*************************************************************************************************************"
						+ "\nDo you accept this mission? Y/N");
				System.out.println("Scene 6 Subscene 1");
				break;
			case 2:
				if (input.equals("Y") || input.equals("y")) { // If the player accepts the mission
					textDisplay = ("\n*************************************************************************************************************"
							+ "\n>>" + playerName + ": Alright, I'm in. It sounds risky, but it could be fun.\n"
							+ "\n>>Big D: Great! I’ll get you the caterer uniform, just meet up behind the high school at 7:00pm Saturday night!\n"
							+ "\n**************************************************************************************************************"
							+ "\n*** You sneak into the senior prom disguised as a caterer and go to let the crew in through the back door. ***"
							+ "\n**************************************************************************************************************");

					Random rand = new Random();
					int missionSuccess = 75; // 75% chance of the player being successful on their mission

					if (rand.nextInt(100) < missionSuccess) { // If the random number is less than 75, then the player
																// is successful!
						textDisplay = textDisplay
								+ "\n*************************************************************************************************************"
								+ "\n****************************************************************************"
								+ "\n*****************************>>>>>SUCCESS<<<<<******************************"
								+ "\n****************************************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n>>" + playerName
								+ ": (excitedly) This is amazing! I can't believe we actually did it.\n"
								+ "\n>>Big D: (smirking) I told you it would be fun.\n"
								+ "\n>>Eddie: (nervously) I don't know guys, we shouldn't be here. What if we get caught?\n"
								+ "\n>>Big D: We're already here and we're blending in, we wont get caught!\n" + "\n>>"
								+ playerName + ": (proudly) That was awesome! We totally pulled it off.\n"
								+ "\n>>Big D: (laughing) Yeah, and we have the pictures to prove it!"
								+ "\n*************************************************************************************************************";
					} else // If the random number is more than 75, than the player is not successful
						textDisplay = textDisplay
								+ "\n>>Security guard: Hey you! You don’t look old enough to be a caterer.\n" + "\n>>"
								+ playerName + ": I am a caterer, I just look young…\n"
								+ "\n>>Security guard: Where’s your badge? You should’ve gotten one from your boss for the event.\n"
								+ "\n>>" + playerName + ": I… must’ve left it in my other uniform…\n"
								+ "\n>>Security guard: Convenient excuse. Let’s go to your boss in the kitchen and have a chat."
								+ "\n*************************************************************************************************************"
								+ "\n*********************************************************************************************"
								+ "\n*** You get kicked out of the prom and you weren’t able to let the crew in the back door. ***"
								+ "\n*********************************************************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n>>Big D: What happened " + playerName
								+ "? We were waiting outside the back door for a long time and you "
								+ "never showed. Were you just having too much fun and didn’t want to let us in?\n"
								+ "\n>>" + playerName
								+ ": I got caught by a security guard. He said that I looked too young to be a caterer. "
								+ "I got escorted out of the prom and my parents were called. Sorry I wasn’t able to pull it off.\n"
								+ "\n>>Big D: We were relying on you. You should’ve been able to blend in better. We missed the entire prom "
								+ "because of you. I’m really starting to doubt your skills. I don’t think we have a place for you in our crew.\n"
								+ "\n>>" + playerName + ": I am really sorry, I promise to do better next time!\n"
								+ "\n>>Big D: I hope so. I really saw a lot of potential in you, but this was a big disappointment."
								+ "\n*************************************************************************************************************";
				} else if (input.equals("N") || input.equals("n")) { // If the player does not accept the mission
					textDisplay = "\n*************************************************************************************************************"
							+ "\n>>" + playerName
							+ ": I don’t think so, I don’t really care to sneak into senior prom.\n"
							+ "\n>>Big D: Come on, don’t be such a square, it’ll be awesome!\n" + "\n>>" + playerName
							+ ": Sorry, I’ve got other plans that night.\n"
							+ "\n>>Big D: Whatever, you are totally missing out!\n"
							+ "\n*************************************************************************************************************";
				}
				System.out.println("Scene 6 Subscene 2");
				break;
			}
			break;
		case 7: // Final Mission - Steal the answers to the finals
			switch (subscene) {
			case 1:
				textDisplay = ("\n*************************************************************************************************************"
						+ "\n>>Big D: (whispering) " + playerName
						+ ", I have a final mission for you. It's our biggest one yet.\n" + "\n>>" + playerName
						+ ": (intrigued) What do I need to do?\n"
						+ "\n>>Big D: (confidentially) We need you to steal all of the test answers for the final exams from the principal's office.\n"
						+ "\n>>" + playerName + ": (surprised) What? That's a huge risk! Why do we need to do this?\n"
						+ "\n>>Big D: (urgently) It's the only way we are going to pass the tests. We need to make sure no one in our crew "
						+ "fails and has to repeat middle school."
						+ "\n*************************************************************************************************************"
						+ "\nDo you accept this mission? Y/N");
				System.out.println("Scene 7 Subscene 1");
				break;
			case 2:
				if (input.equals("Y") || input.equals("y")) { // If the player accepts the mission
					textDisplay = ("\n*************************************************************************************************************"
							+ "\n>>" + playerName + ": (nodding) I’ll do it. What's the plan?\n"
							+ "\n>>Big D: (explaining) You'll need to sneak into the principal's office, log into his computer and print out the "
							+ "test answers. Be careful not to get caught. And if you do, deny everything.\n" + "\n>>"
							+ playerName + ": How do I sneak into the principal’s office without getting caught?\n"
							+ "\n>>Big D: We’ll help you, and here are the items to get the job done."
							+ "\n\t -Hall pass to get to the office safely"
							+ "\n\t -Firecrackers to get the principal and office staff out of his office and the main office"
							+ "\n\t -Lockpick to get into the principal’s office"
							+ "\n\t -Two-way radio to communicate with the look out"
							+ "\n\t -The principal’s username and password to login"
							+ "\n*************************************************************************************************************************"
							+ "\n************************************ You set off on your final mission of the year. *************************************"
							+ "\n************************************ You walk through the halls with the hall pass, *************************************"
							+ "\n*********************************** set off the firecrackers to create a distraction, ***********************************"
							+ "\n********************************* and pick the lock to get into the principal’s office **********************************"
							+ "\n*************************************************************************************************************************");

					Random rand = new Random();
					int missionSuccess = 75; // 75% chance of the player being successful on their mission

					if (rand.nextInt(100) < missionSuccess) { // If the random number is less than 75, then the player
																// is successful!
						textDisplay = textDisplay
								+ "\n*************************************************************************************************************"
								+ "\n>>" + playerName + ": (whispering) Alright, I'm in. Now to find the test answers."
								+ "\n*************************************************************************************************************"
								+ "\n****************************************************************************************"
								+ "\n*** You log into the computer and find the test answers and start printing them out. ***"
								+ "\n****************************************************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n>>" + playerName
								+ ": Looks like the last test just printed. I better get out of here before the "
								+ "principal comes back!\n" + "\n>>Lookout (over two-way radio): " + playerName
								+ ", the coast is clear, hurry up!\n"
								+ "\n*************************************************************************************************************"
								+ "\n****************************************************************************"
								+ "\n*************************** >>>>> SUCCESS <<<<< ****************************"
								+ "\n****************************************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n********************************************************************"
								+ "\n*** You are able to sneak back out with the help of the lookout. ***"
								+ "\n********************************************************************"
								+ "\n*************************************************************************************************************"
								+ ">>Big D: (excitedly) You did it! You got all of the test answers!\n" + "\n>>"
								+ playerName + ": (proudly) Yes, I did. It wasn't easy, but I managed to get them.\n"
								+ "\n>>Big D: (grateful) Thank you for your hard work. You've done a great service for everyone in the crew.\n"
								+ "\n*************************************************************************************************************"
								+ "\n*************************************************************************************************************"
								// Outro if the player wins
								+ "Congratulations " + playerName
								+ " on winning \"Middle School Mayhem\"! You've successfully navigated the "
								+ "social and academic challenges of middle school, and your skills and determination have paid off.\n"
								+ "\nThroughout the game, you've tackled various missions, from sneaking into the senior prom to changing a student's "
								+ "grade before report cards were printed. You've shown creativity, resourcefulness, and a willingness to take risks "
								+ "to achieve your goals. But more importantly, you've learned important life lessons about teamwork, creativity, "
								+ "and ambition. You've discovered that working together with others can help you accomplish more than you "
								+ "could on your own, and that being determined and working with others is crucial for success.\n"
								+ "\nAs you move on from middle school and face new challenges, remember the skills and lessons you learned in \"Middle "
								+ "School Mayhem\". Whether you're navigating high school, college, or the working world, these skills will continue to "
								+ "serve you well.\n"
								+ "\nOnce again, congratulations on your victory in \"Middle School Mayhem\"!\n"
								+ "\n*************************************************************************************************************";
					} else // If the random number is more than 75, than the player is not successful
						textDisplay = textDisplay
								+ "\n*************************************************************************************************************"
								+ "\n>>" + playerName + ": (whispering) Alright, I'm in. Now to find the test answers."
								+ "\n*************************************************************************************************************"
								+ "\n****************************************************************************************"
								+ "\n*** You log into the computer and find the test answers and start printing them out. ***"
								+ "\n****************************************************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n>>Lookout: (over two-way radio) " + playerName
								+ "! We got a problem! The principal told the security "
								+ "guard to figure out who set off the firecrackers and he’s on his way back. You have to get out of there NOW!\n"
								+ "\n>>" + playerName
								+ ": But I haven’t finished printing out all of the test answers. Can you buy me some time?\n"
								+ "\n>>Lookout: No way, there’s not enough time for another distraction. You either get out now or you get caught!\n"
								+ "\n*************************************************************************************************************"
								+ "\n***********************************************************************************"
								+ "\n*** You try to leave, but run into the principal right outside the office door. ***"
								+ "\n***********************************************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n>>Principal: What are you doing here?\n" + "\n>>" + playerName
								+ ": I was just doing a task for Mr Smith. Here’s my hall pass…\n"
								+ "\n>>Principal: Hall pass doesn’t give you permission to go into my office. Where’s your teacher’s note?\n"
								+ "\n>>" + playerName + ": He didn’t give me one…\n"
								+ "\n>>Principal: Then what are the papers in your hand?\n"
								+ "\n*************************************************************************************************************"
								+ "\n*****************************************************"
								+ "\n*** The principal grabs the test answers from you ***"
								+ "\n*****************************************************"
								+ "\n*************************************************************************************************************"
								+ "\n>>Principal: These are the test answers for the finals next week. What would Mr Smith want with these?\n"
								+ "\n>>" + playerName
								+ ": He didn’t tell me why, just that he wanted me to get a copy for him…\n"
								+ "\n>>Principal: I don’t believe a single word you are saying, it doesn’t make any sense. Let’s go talk "
								+ "with Mr Smith and get the real story.\n"
								+ "\n*************************************************************************************************************"
								+ "\n********************************************"
								+ "\n****You get expelled and get held back!!****"
								+ "\n********************************************"
								+ "\n*************************************************************************************************************"
								// Outro if the player loses
								+ "While it's disappointing to have not won \"Middle School Mayhem\", " + playerName
								+ " it's important to "
								+ "remember that sometimes we don't always achieve the outcome we hope for. However, the experience gained "
								+ "and lessons learned along the way can be just as valuable.\n"
								+ "\nThrough your efforts in the game, you've likely learned about the challenges of navigating social "
								+ "dynamics, dealing with academic pressures, and balancing competing priorities. You may have also discovered "
								+ "areas where you can improve, whether it be through sharpening your talents and skills or working on "
								+ "your resourcefulness.\n"
								+ "\nAs you reflect on your experience, think about what you can take away from the game and apply to your life going "
								+ "forward. Consider how you can continue to work on areas of weakness, and how you can build upon your strengths to "
								+ "achieve success in the future.\n"
								+ "\nRemember, losing at a game doesn't mean you're a failure, and it doesn't define your worth as a person. "
								+ "What matters most is that you tried your best, learned from your mistakes, and continue to strive towards "
								+ "your goals. So don't give up, keep pushing forward, and keep learning and growing.\n"
								+ "\n*************************************************************************************************************";

				} else if (input.equals("N") || input.equals("n")) { // If the player does not accept the mission
					textDisplay = "\n*************************************************************************************************************"
							+ "\n>>" + playerName + ": I’m out, that is just too risky of a mission.\n" + "\n>>Big D: "
							+ playerName
							+ ", this is the most important mission I’ve ever given you. With your computer "
							+ "knowledge and the rewards you’ve earned, you’re the only one that can pull it off. If there’s ever a "
							+ "mission that you need to do, it’s this one.\n" + "\n>>" + playerName
							+ ": Sorry, but I’m out. Guess I’m not in the crew?\n"
							+ "\n>>Big D: If you really won't do this mission, yeah, you’re not in the crew. We take care of each other, "
							+ "and if you aren’t willing to do that, we can’t have you.\n"
							+ "\n*************************************************************************************************************"
							// Outro if the player loses
							+ "While it's disappointing to have not won \"Middle School Mayhem\", " + playerName
							+ " it's important to "
							+ "remember that sometimes we don't always achieve the outcome we hope for. However, the experience gained "
							+ "and lessons learned along the way can be just as valuable.\n"
							+ "\nThrough your efforts in the game, you've likely learned about the challenges of navigating social "
							+ "dynamics, dealing with academic pressures, and balancing competing priorities. You may have also discovered "
							+ "areas where you can improve, whether it be through sharpening your talents and skills or working on "
							+ "your resourcefulness.\n"
							+ "\nAs you reflect on your experience, think about what you can take away from the game and apply to your life going "
							+ "forward. Consider how you can continue to work on areas of weakness, and how you can build upon your strengths to "
							+ "achieve success in the future.\n"
							+ "\nRemember, losing at a game doesn't mean you're a failure, and it doesn't define your worth as a person. "
							+ "What matters most is that you tried your best, learned from your mistakes, and continue to strive towards "
							+ "your goals. So don't give up, keep pushing forward, and keep learning and growing.\n"
							+ "\n*************************************************************************************************************";
				}
				System.out.println("Scene 7 Subscene 2");
				break;
			}
			break;

		}
		return textDisplay;
	}

}