package com.ayush.metacogn;

import java.io.PipedOutputStream;
import java.util.Locale;



import android.app.ActionBar.LayoutParams;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.AdapterView.OnItemClickListener;

public class Description_page extends Fragment{
	int m1=0,m2=0,posi;
	
	/*String[][] problemstatement={{"Java guru is a technical event where one's coding capability in java language will be tested. Along with the proper knowledge of coding terms, a brain with good logical approach will be needed to get through the event."},
			 					  {"The PRESSURE PICASSO is an event in which a hydraulic arm has to be made. The arm will be made using syringes, ice-cream sticks, pipes, solenoid, battery, etc. Each team is required to bring its own model i.e. the hydraulic arm and thus have to perform the task in a specified time."}};
	 String[][] description={{"ROUND 1: "+"\n"+" The first round being quiz where individuals will be tested on questions based on core java concept and syntax of java. A 30 min MCQ quiz will be the next part of the round."+"\n"+"ROUND 2:"+"\n"+"This round would test participants programming skills. Qualifiers from the first round will have to answer 7 questions in duration of an hour using their java skills.","DESIGN","FRAG","XQUIZITE","INNOVATE","BRAIN BLOGGER","CODING/DECODING","ROBOTICS"}};
	 
	 
	 String[][] rules={{"There must be one member in a team."+"\n"+"A member can be of different college."+"\n"+"No need to carry their own resource such as pc, we’ll provide you. ."+"\n"+"Two rounds will be held."+"Round1 :- Is the objective round where participating member answer the question"+" \n"+"Round2:- Is the objective round where participating member perform the operation of java language."+" \n"+"Limited time will be given for doing the task."+" \n"+"Members will be eliminated after first round."+" \n"+"Participants are not allowed to take help from internet or any other resource.","DESIGN","FRAG","XQUIZITE","INNOVATE","BRAIN BLOGGER","CODING/DECODING","ROBOTICS"}};
	 
	 String[][] coordinator={{"ANKIT VERMA"+"\n"+"MARUSHI SHARMA ","DESIGN","FRAG","XQUIZITE","INNOVATE","BRAIN BLOGGER","CODING/DECODING","ROBOTICS"}};
	 String[][] coordinator_no={{"8826947172-8009830073","DESIGN","FRAG","XQUIZITE","INNOVATE","BRAIN BLOGGER","CODING/DECODING","ROBOTICS"}};
	 Integer[] eventpic = {
		      R.drawable.meta1,R.drawable.meta2,R.drawable.meta3,R.drawable.meta4,R.drawable.meta5,R.drawable.meta6,R.drawable.meta7,R.drawable.meta8
		      };
	 String[][] events_title={{"Introduction","description","Rules","Coordinator"},{"Introduction","description","Rules","Bot","Coordinator"},{"DESIGN","FRAG","XQUIZITE","INNOVATE","BRAIN BLOGGER","CODING/DECODING","ROBOTICS"}};
	 
	 public static Description_page newInstance() {
			return new Description_page();
		}
		
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
	    	//setContentView(R.layout.activity_my_main);
		View view1;
		int i;

	    
 	   view1 = inflater.inflate(R.layout.activity_my_main, container, false);
 ListView view=(ListView)view1.findViewById(R.id.listView1);
	       view.setBackgroundColor(Color.BLACK
	    		   );
	       int posi=getArguments().getInt("POSI");
	       int m1=(posi/10);
	       int m2=posi%10;
	       String[] title=new String[events_title[m1].length];
		    String[] contents=new String[events_title[m1].length];;
		    Integer[] imageId;
		    
	       for(i=0;i<events_title[m1].length;i++)
	       {
	    	   title[i]=events_title[m1][i];
	 if(i==0)      {
	       contents[i]=problemstatement[m1][m2];}
	 else if(i==1)      {
		       contents[i]=description[m1][m2];}
	 else if(i==2)      {
		   contents[i]=rules[m1][m2];}
	 else if(i==3)      {
		   contents[i]=coordinator[m1][m2];}
	}
	        
	     imagecustom4 adapter = new
   	        imagecustom4(getActivity(),title,contents, eventpic);
   	/* final imagecustom adapter1 = new
   	        imagecustom(raceingpart.this, contacts3, imageId);
   	/
		view.setAdapter(adapter);
		
   	registerForContextMenu(view);
   	//view.setOnItemClickListener(clickb);    	
	return view1;
	}
	}
*/
	SectionsPagerAdapter mSectionsPagerAdapter;

	public static final String TAG = Schedule.class.getSimpleName();
	String[][][] events_title={
								{
									{"Introduction","Rules","Registration Fee ","Coordinator"},
									{"INTRODUCTION","DETAILS","Registration Fee ","Contacts "}
								},
								{
									{"Introduction","Structure","Registration Amount","Coordinator"},
									{"Introduction","Structure","GUIDELINES","Registration Amount","Coordinator"},
									{"Introduction","AIM","GUIDELINES","RULES","JUDGEING CRITERIA","Registration Amount","Coordinator"}
								},
								{
									{"INTRODUCTION","Rules and Regulations","Registration Fee","Contacts"},
									{"INTRODUCTION","Rules and Regulations","Contacts"},
									{"INTRODUCTION","Rules and Regulations","Registration Fee","Contacts"},
									{"INTRODUCTION","Registration Fee","Contacts"},
										
									
								},
								{
									{"Rules and Regulations","REGISTRATION AMOUNT","Contact"},
									{"General","Game Rules","Player Rules","Gameplay options","Allowed classes","REGISTRATION AMOUNT","Contact"},
									{"Rules and Regulations","GAME SETTINGS","REGISTRATION AMOUNT","Contact"},
									{"Game Play","Tournament Server Settings","RULES AND REGULATION","Contact"},
									{"INTRODUCTION","Rules and Regulations","Registration Fee","Contacts"},
									
								},
								{
									{"INTRODUCTION ","GENERAL RULES","STAGE-I","STAGE-II","Final Presentations","JUDGING CRITERION","REGISTRATION PROCEDURE","Contact"}
								},
								{
									{"About the game","Introduction","Rules and Regulations","REGISTRATION AMOUNT","Contact"},
									{"Rounds","REGISTRATION AMOUNT","Contact"},
									{"INTRODUCTION","Registration Fee","Contacts"},
									{"INTRODUCTION","Registration Fee","Contacts"},
									{"INTRODUCTION","Format and Layout","Rounds","RULES","Registration Fee","Contacts"}
								},
								{
									{"INTRODUCTION","DETAILS","Registration Fee ","Contacts "},
									{"need update"},
									{"INTRODUCTION","Game","Guildlines","REGISTRATION AMOUNT","Contact"},
									{"INTRODUCTION","Game","Rules & Guildlines","REGISTRATION AMOUNT","Contact"},
									{"Game","REGISTRATION AMOUNT","Contact"},
									
									
								},
								{
									{"PROBLEM STATEMENT","ARENA AND ROBOT SPECIFICATIONS","CONTROLS","RULES","TEAM","PENALTIES AND DISQUALIFICATION","REGISTRATION AMOUNT","Contact"},
									{"Aim","Rules and Regulations","Registration Fee ","Contacts "},
									{"INTRODUCTION ","Specification","Rules","FORMAT OF TOURNAMENT","Registration Fee ","Contacts "},
									{"Problem Statement","Rules","POINT ALLOCATIONS","BOT SPECIFICATIONS","Registration Fee ","Contacts "}
								}
							   };
	 String[][][] problemstatement={
			 						  {
			 							  {
			 							   "A Quiz designed to test your logical and reasoning ability on the basis of existing knowledge of scientific theories. The quiz tests the participant’s ability to identify whether the given theory is Legitimate or a Hoax. The name of this event is science hoax.",
			 							   "A team consisting of three members or less is required in order to participate. A qualifying round will be conducted on a preliminary basis. In this entrance round a multiple choice questionnaire containing 20 questions testing simple physics theories (Class 9 to 12). The Top Ten Teams will qualify for the stage rounds. \n The second round is divided into 3 phases. Each phase will consist of one full clock or anti clockwise cycle of quizzing. The first phase is simple, “Relatively�? speaking. Each team will be asked a question and the team has to answer whether the given theory is a hoax or not and if it is a hoax then they will be required to give an explanation. Don’t worry hoaxes will be simple (can be answered in 5 seconds if the participants are familiar with the theory). The second phase will be a visual round. A picture depicting a hoax will be shown; the participants have to identify the hoax. In both these phases you will be rewarded with credits for a correct answer only. No points or negative marks on the wrong answer; Bonus points will be awarded if the passed question is answered correctly. The third phase is a buzzer round. There will be ten questions; the team to press the buzzer first will attempt the question. \n After the second round the bottom 5 teams will be eliminated. The top 5 teams will now compete for the cash prize. The Third round’s difficulty level is a little higher than the previous rounds. Herein there will be two cycles of questioning. Various hoax containing scientific fields will be shown to the participants. A field has to be selected; The participants will then attempt a hoax on the respective field. (Hoax can be explained in 10 seconds).\n At the end, as per the cumulative score of each team starting from the second round, the winner will be decided. \n","There must be one member in a team."+"\n"+"A member can be of different college."+"\n"+"No need to carry their own resource such as pc, we’ll provide you. ."+"\n"+"Two rounds will be held."+"Round1 :- Is the objective round where participating member answer the question"+" \n"+"Round2:- Is the objective round where participating member perform the operation of java language."+" \n"+"Limited time will be given for doing the task."+" \n"+"Members will be eliminated after first round."+" \n"+"Participants are not allowed to take help from internet or any other resource.",
			 							   "₹100 per team",
			 							   "--" 
			 							  },
			 							  {
	 										"Mathematics is the language of nature. God used beautiful mathematics in creating the world. Without mathematics, there’s nothing you can do. Everything around you is mathematics. Everything around you is numbers. It is a play that starts with ‘zero’ and tends to infinity. Mathematics has beauty and romance. It’s not a boring place to be, the mathematical world. It’s an extraordinary place; it’s worth spending time there. \n Here is an opportunity in METACOGNITION’15 to play with Mathematics. We invite you to participate in “AMUSING MATH�? and test your mathematical skills.",
	 										"This event can be participated by a team of two or individually. The event comprises of 3 rounds. \n \n ROUND 1:\n This round consists of 30 objective type questions. Each team will be given only 30 minutes time. Each write answer will give you 3 marks and 1 mark will be deducted for every wrong answer. No mark will be given or deducted for not answering the question. \n In this round, the questions will test your basic mathematics, reasoning capabilities, ‘General Knowledge’ of Mathematics, Mathematicians etc.\n The top 20% – 25% Teams will be taken into the second round. \n ROUND 2: \n This is a puzzle round where the teams are supposed to solve Mathematical puzzles in the given time. The top few teams will be finalized in this round. \nROUND 3: \n This round will consist of 5 subjective questions. Step marking will be done in this round. The team to get maximum marks wins. \n",
	 										"₹100 per team",
	 										"Kushagra Sharan: +919540440479 \n Kumar Shubham: +918588820627"
			 							  }
			 						  },
	 								  {
			 							 {
			 								 "Crazy about spellings: Check \n Proclaims to be a grammar nazi: Check\n Pro at pronunciations : Check \n Hey, you – Mr.Ross Gellar. \n In this fray among the best of bests, lets see who sets the stage ablaze. \nLights. Camera. Fire. WORDS. \n And as the flame of the grammar nazis’ scorches the skies in this war of words, we welcome you to the battle of Spellathon, at Metacognition’15. See you there!",
			 								 "•The pronouncer will pronounce the word and the speller has to spell it. It is to be noted that the speller is expected to pronounce the word before spelling it so that the pronouncer can be assured that the speller heard it right. Also, after spelling the word, the speller will be expected to again pronounce it so that the judges can know that the speller is done.\n•The speller may ask the pronouncer to pronounce the word again, define it or use it in a sentence. Judges may disqualify any speller who ignores the request to start spelling.\n•Having started to spell a word, a speller may stop and start over, retracing the spelling from the beginning. But during this course, the speller is not allowed to change the sequence of the letters from those, first spelled. So, a speller cannot correct himself or herself, even while it is still his or her turn.\n•The contest will be conducted in rounds. Each speller, remaining in each round will spell one word in the round, except when there are two spellers remaining.\n•If a word has one or more homonyms, the pronouncer will indicate which word is to be spelled, either by defining it or by using it in a sentence. If the pronounced word is not properly identified by the speller, correct spelling of any homonym of the word will be accepted.\n•When the number of spellers are reduced to two, the rule changes. When one speller misspells a word, the other speller will get the opportunity to spell the same word. If the second speller spells that word correctly and the next word on the pronouncer’s list, the second speller shall be the winner.\n•If the second speller is unable to spell the word, the word is again passed on to the first speller. If he or she spells the word passed and the word given to him or her on his own turn, then the first speller will be declared as the winner. If both the spellers, misspell the word, then another round takes place as earlier discussed.\n•Protest may be filed by anyone wishing to reinstate a speller into the contest but will not be heard from \n•any individual seeking to dislodge another speller from the competition. Deadline for filing a protest is before the speller affected would have received his or her word and he or she stayed into the contest.\n•Protest should be verbally made to a designated person immediately or upon completion of a round.\n•Judges are the controller of the contest. Their decisions are final.\n•Please have fun and relax.",
			 								 "INR 30 PER HEAD",
			 								 "Ronit: +918004084550"
			 							  },
	 									 {
			 								  "Are you spontaneous enough to face the grammar Nazis, the chatter boxes and the I-Do-Not-Stammer-At-All sorts in a battle of two minute? Well, if yes, come and fight it out among a medley of people in this battle of wits and brains at our impromptu gig, Extempore.",
			 								  "Each participant will be given a total time of two minutes. One minute for introspecting the topic and the other one minute for speaking. Contestants will have to speak on the topic without hesitation, stammering and repetition. Speakers at all times must be grammatically and factually correct and must speak within the confines of the given topic. A small bell will ring after 45 seconds of the speaking time. The speaking time will include a brief introduction of the speaker. \n A second round can take place, if there is a tie between two speakers. The decision of the organising committee is final, in case of any dispute.",
			 								  "•English should be the language of communication \n •Speech notes are not permitted during the time of the speech. Cue and palm cards are however permitted. However, their use should not hamper the speaker’s visual engagement with the audience. \n•Participants must carry their own pens.\n •Discipline is of prime importance.",
			 								  "Rs 50 PER HEAD",
			 								  "Soman- +918527787397 \n Siddharth: +918287683957"
			 							},
			 							{
			 								"In this carnival of the tech-enthusiasts, the geeks, the technocrats and so many more, we present to you the Debate competition. \n Contemplate. Cogitate. Contest.",
			 								"Present your debating  skills",
			 								"•It will be an oxford style debate conducted in two rounds.\n•Eight teams will qualify for the finals to be held on the second day.\n•Structure of the Event: Each speaker gets a floor time of three minutes. There will be two interjections, following the speech of every speaker, either from the judges or the audience.\n•The topic for the first round is “India or west, the land of opportunities�?\n•The topic for the Final round will be announced on the day of the first round itself.\n•",
			 								"1.Maximum time limit for  speaking -3 min \n2.No use of abusive words in the speaking content .\n3.Students shall be given time to pen down their ideas on paper sheets will be provided, and collected at the end of the event.",
			 								"•Negative marks will be awarded for exceeding the time limit.\n•Extra marks will be awarded for the body language /confidence/speaking skills.\n•Extra points will be awarded for strong points /views /relevant statistical data involved in the content.\n•Plus points for completely sticking on topic  like the for/against  the motion.",
			 								"Rs 50 PER HEAD",
			 								"Soman- +918527787397 \n Siddharth: +918287683957"

			 							}
	 								  },
	 								  {
	 									  {
	 										  "Do you really brag about your aided graphical skills or think you are an efficient and smart designer?\nThen it is time to prove yourself at a game of both skills and speed.",
	 										  "1.You would be asked to design in two levels.\n2.The platform given would be AUTOCAD or AUTODESK INVENTOR, and it’s your choice to choose one.\n3.The level 1 comprises of a design or a task that has to be completed in a given time. Failing prompt will make you disqualified.\n4.The level 2 comprises of another given design task, the one who does it first shall be declared victor..\n5.Any cheating or misconduct would lead to disqualification.",
	 										  "Rs. 80",
	 										  "Abhay- +919990396887"
	 									  },
	 									  {
	 										  "Ever wondered how some great short movies like ‘Land without bread’ or the recent ‘TVF Pichers’ were made by a bunch of inexperienced guys on the lukewarm days of holiday. So now is the time to shred the wonder-struck face,take a camera(maybe a 5MP one), and show the world what you want them to. Take a camera(or a phone), and trek across our campus.\n Capture videos, or photos and join them.\nAdd effects and then submit it to us and we’ll provide you the platform to flaunt what is yours.\n",
	 										  "1)You need to make a picturesque presentation of your campus. It can be a campus tour video or a slideshow of snaps.Edit them the way you like, add music,add after effects.\n3)Take care of the maximum time limit of 5 minutes.\n3)No bar on use of editing software. Any, and all elements are allowed.\n4)Once prepared, send us the video through the official fb metacognition page i.e www.fb.com/metacognitionfest, with your Team’s name followed by the details of its members.\n5)Final decision will be taken by judges after watching the video.There will be NO JUDGEMENT based on the LIKES, or COMMENTS a video gets.\n6)Each team has to submit a fees of 50/­ to the contact given at the end.\n7)The last date for the submission of the video is 1st October,failing to which no entries shall be accepted.\n8)The team with the best video will get a cash prize along with exciting goodies in the days of the festival.\n",
	 										   "Vibhav: 9899279446 \n Vikash: 8285872278\nKushagra: 8765550098"
	 									  },
	 									  {
	 										  "Topic for the event: To be provided on the spot",
	 										  "\n•The coordinators will provide you with a sheet of A4 sized paper.\n•You are requested to carry your own toolkit which may include pencils, erasers, sketch-pens, crayons and/or pencil colors. Any form of paint colors are prohibited in the event.\n•The purpose of the event is to draw, and create an original advertisement on the provided topic using the allowed methods.\n•The artwork shall be marked on the grounds of its originality, meaningfulness and humor or any other meaning attached to it.\n•The judge’s decision on the scorecard shall be the final assessment of the event.",
	 										  "Rs 50",
	 										  "Kumar Shubham: 8588820627 \nAnkitSrivastava: 9899098262\nKushagarSharan: 9540440479"
	 										  
	 									  },
	 									  {
	 										  "Design a logo of our technical fest METACOGNITION and mail the same to our email id: teamenthiran@gmail.com by the end of the festival along with your contact details.. The best among the entries shall be declared as winner.",
	 										  "FREE OF COST",
	 										  "SARANSH GUPTA- 8800844282 "
	 									  }
	 								  },
	 								  {
	 									 {"•Tournament will base on Knock out concept.\n•Winner shall be decided by the best of 3 matches.",
	 										 "Rs.50 PER HEAD",
	 										 "Gaurav Idnani- 8447824581 \nArjun Succena- 9971062902 \nTejas Vyas- 9810914613"},
	 									{"Call of duty : Modern Warfare Tournament \nFree For all \n Map : 1) Shipment (rounds) \n2) Downpour( final )",
	 											 "Time limit : 10 minutes \nScore limit : Unlimited",
	 											 "Number of lives : Unlimited \nRespawn delay : None\nMax health : Normal\nHealth Regeneration : Normal\nKillcam : Disabled\n",
	 											 "Headshots Only : Disabled \nPerks : Disabled\nKillstreak Rewards : Disabled\nHardcore Mode : Disabled\n3rd Person : Disabled\n",
	 											 "Grenadier \nFirst Recon\nOverwatch",
	 											"Rs.50 PER HEAD",
		 										 "Gaurav Idnani- 8447824581 \nArjun Succena- 9971062902 \nTejas Vyas- 9810914613"
	 									},
	 									{"Game Version – most wanted \n1).General rules\nThere will be 3 rounds in total\n– 1st round\nElimination round\nThe players will be competing in groups of 4 for lap knockout races. Winner will move to the next round.\n 2nd Round\nThe players will be competing in groups of 4 for sprint races. Winner will move to next round\n– 3rd round(optional)\nIf more than 4 players are there to compete. They will face each other in circuit races of 2 laps. Time to be added up.\n– Final round\nBest of 3\n3 races (drag, sprint ,and circuit race)\nWinner of 2 races is going to grab prize money .\n2).Other Rules –\nOther controllers, steering wheels are not allowed.\nKeyboards can be brought.\nEarphones/headphones will not be provided. Participants have to bring their own earphones/headphones.\nAt the end of each match,players must maintain the final screens and receive confirmation.\n",
	 										"Track Direction:Forward \nLaps:3(Final and the Semifinals) Nitro:On\nCollision Detection:on\nPerformance Matching:on\nMaximum Number of Players 4\nCar Damage:on\nThe best part !…..yeah we havent told you about cars yet.\nFully modded cars (in game version and out game version) will be there to drive !\nPerformance matching on so no worries..\nSo gear up guys ! Pick your ride and show us what have you got ! Cuz its gonna be hell lot different and absolutely on a higher level this time.\nGAME ON ! ITS GUTS TO GLORY\n",
	 										"Rs.50 PER HEAD",
	 										 "Gaurav Idnani- 8447824581 \nArjun Succena- 9971062902 \nTejas Vyas- 9810914613"
	 										},
	 									{"•Game Version: Counter-Strike Source\n•Competition Method : 5 vs. 5 (Team Play, 5 players per team)\n•As a default 1 mouse and 1 keyboard will be provided for all players other than that players can bring their own mouse,keyboard and headphones.\n•Rounds: 10 Rounds (Max rounds format): 5 rounds as Terrorists and 5 rounds as Counter-Terrorists per team (If a team scores 6 rounds first, the match is ended immediately.)\n•Victory Condition: The first team to win 6rounds.\n•Round Time: 1 minute 45 seconds.\n•The team playing as the Terrorist side first will be announced before the match or decided by coin toss.\n•Team players can talk to each other during freeze time\n•In the case of a tie after the regulation rounds end, 2 extra rounds will be played. (1 rounds as Terrorists / 1 rounds as Counter-Terrorists per team) In the case of yet another tie 1 additional extra rounds will be played to break the tie the sides will be decided by a toss.\n•Official Maps: De_Dust2, De_Inferno, De_Nuke, De_Train\n•Team members must only use team message (messagemode2), while in a match.\n•At the end whatever the decision referee makes will be the final decision no objection will be tolerated on that",
	 											"•mp_autocrosshair 0\n•mp_buytime 0.25\n•mp_fadetoblack 1\n•mp_flashlight 1\n•mp_freezetime 15\n•mp_friendlyfire 1\n•mp_roundtime 1.75\n•mp_tkpunish 0\n•sv_cheats 0\n•sv_clipmode 0\n•sv_gravity 800\n•sv_lan_rate 25000\n•sv_maxrate 25000\n•sv_maxspeed 320\n•sv_maxupdaterate 101",
	 											"•Any player or team caught breaking a rule or performing an infraction will be subject to either a warning, at the minimum, or a forfeit loss, at the discretion of the referee.\n•When a player has died, he may communicate verbally with other players, but he must remove his hands from his keyboard and mouse until the beginning of the next round.\n•A player is deemed dead when the screen is completely faded to black.\n•If a player touches his mouse or keyboard while dead, the team will be subject to either a warning, at the minimum, or a forfeit loss, at the discretion of the referee.\n•The use of ‘SKY Box’ will result in a loss by default for the offending team.\n•If the refree decides that external conditions (Press, Team Leader, Player, Spectator, etc) give unfair advantage to a player, the team may be given a warning or lose by default at the referee’s sole discretion.",
	 											"Gaurav Idnani- 8447824581 \nArjun Succena- 9971062902 \nTejas Vyas- 9810914613"
	 											},
	 									{"GOOOOAAAALLLL! – The exclusive FIFA  tournament at METACOGNITION\n\nGOOOOAAAALLLL! is a gaming event, at GALGOTIAS COLLEGE OF ENGINEERING AND TECHNOLOGY,annual TECHFEST ‘METACOGNITION’. EA Sports’ annual edition of the FIFA game, FIFA 14, will be played at the event, on LAPTOP And CONSOLE. Players from various colleges may register, play and stand a chance to win prizes, if victorious over the two day event. Players will go through the range of emotion every football fan in a stadium goes through, only this time, they’re in control of their beloved teams’ fortunes. The event promises to be a test of skill, grit, calmness and so much more.",
	 												"° Tournament is a single player versus single player only.\n° No two keyboard players will play against each other\n° Registrations can be made prior to the tournament and on the spot as well.\n° The duration of every game is 6-minutes a half.\n° The weather will always be set to clear.\n° The squads are updated and updated as per the transfer window.\n° The Qualifying rounds will have normal time and golden goal\n° The Final rounds will have extra time after normal time followed by penalties if the scores are tied.\n° World XI, Classic XI and are not allowed.\n° As per online regulations only tactical defending is allowed, this in keeping with changing FIFA meta-game.\n° Custom tactics cannot be changed.\n° All players will receive a maximum of 3 minutes to complete their team management and three substitution breaks during the game to make changes or substitutions. Each of these three breaks will be for a maximum of 30 seconds.\n° Players can make changes only when the ball is out of play.\n° Pausing the ga oint without the prior permission of the organizers will lead to warning or disqualification depending on the effect caused due to the pause in play.\n° Camera, Visual, Audio and Game Brightness is set as default and will not be changed.\n° Wireless Controller settings can be changed to suit the player in any way he/she likes, but these changes will have to be made either in the 3 minutes allotted prior to the game or in one of the three 30 second breaks during.\n° A partcipant or any other person who damages the property of or pertaining to the tournament will be held liable, i.e. any fines or other amounts that arise due to such damage must be paid by the person who causes such damage.\n",
	 												"Rs.50 PER HEAD",
	 		 										 "Gaurav Idnani- 8447824581 \nArjun Succena- 9971062902 \nTejas Vyas- 9810914613"
	 		 										
	 												},
	 									
	 								  },
	 								  {
	 									  {
	 										  "There is one thing stronger than all the armies of the world, that is.. ‘An  IDEA’, whose time has come.",
	 										  "1.Any undergraduate  or  masters  student  of  any  discipline  is  eligible  to  participate  in  this event. However PhD students and research scholars are not allowed to present their papers. \n 2.Each team may have a maximum of four members.\n3.No team is allowed to send more than one entry for the same departmental cell, but you are free to send multiple entries provided your papers are related to different cells.\n4.This event  will  be  conducted  in two  stages and  its  detailed  procedure  has been  clarified below.",
	 										  "Abstract Submissions \n \n Topic – ( Effective usage of Energy and Energy Production ) \n \n1) Participants are needed to send in the abstract of the original/review work including the references, the idea proposed with figures (if needed) to teamenthiran@gmail.com \n2) Abstract should not exceed 500 words and the covering page of the abstract must have Name(s), Institution of study, Email address(es), Contact number(s), Name of the cell you wish  to  present  the  paper  in,  Topic of  paper  presentation  & registration details.\n3)  Your  email  should  have  the  category  name  as  your  subject  and  your  file  name  should have the title of the concerned paper.For Example, a paper on simulation of a Hydrocracker unit in a refinery unit should have its mail  subject  as  “IDEAZ:  Modelling,  Simulation,  Design  and  Process  Control:  GCET15/XXXXX�? and its title as “Simulation of Hydrocracker unit�?.\n4) Selection  to  the  next  round  for  final  presentations  will  be  based  on  the  abstract submitted.\n5)   Deadline for Abstract Submissions is 2nd october 2015.\n6) The result for the first round will be put up on the website till 6th october 2015 and will also be mailed to you.\n7) For  any  particular  queries  regarding paper  presentations,  please  contact  the  event coordinators.",
	 										  "Full Paper Submissions \n\nTopic – ( Effective usage of Energy and Energy Production )\n\nThe  second  round  will  be  conducted  at  GCET  during  METACOGNITION 2015  (10th-11thoctober2015). \n1) Participants should submit their full paper in “.doc�? and “.pdf�? format. You need to bring two  hard  copies of  your  complete  paper  (i.e.  printed  report)  &  two  passport  size photographs of each participant along with all the necessary details attached.\n2)  Formatting  rules  should  be  strictly  followed.  A font  type  of  Bookman  Old  Style  with  a font size of 12 should be kept.\n3)  Participants  should  ensure  that  their  papers  include  all  relevant  figures,  tables  and bibliography.\n4) Submissions, in any case, should not exceed 12 pages in length.",
	 										  "Topic – ( Effective usage of Energy and Energy Production )\n\n1) Final Presentations should be in “.ppt�?  format strictly and should be timed for 15 minutes (12 minutes for presentation and 3 minutes for Question and Answer round).\n2) The decision of the judges shall be final and binding.",
	 										  "1.The event consists of 100 points with report consisting of 60 points and presentation 40 points.\n2.The presentation time shall be 20 minutes.\n3.The teams have to wrap up the presentation within the given limits. A warning bell shall be issued two minute before the end of 20 minutes.\n4.Feasibility -> 20 points\n5.Innovativeness -> 15 points\n6.Design -> 15 points\n7.Discussion -> 10 points\n8.Presentation -> 40 points\n9.The decision of judges shall be considered as final.",
	 										  "The registration shall be done through the Metacognition website.\nRegistration Fee : Rs 200\n\nSteps\n\nEach member needs to register on the website. This will generate a unique meta ID.\nSubmit your entries and mail your queries to teamenthiran@gmail.com"
	 									  }
	 								  },
	 								  {
	 									  {
	 										 "This year we will play a newer game, a tougher one that tests us to degrees never experienced before.\nWelcome to the Warzone!!!",
	 										 "The game introduces a series of puzzles that had gone missing in the tides of time through various ancient Japanese cultures and societies. Each one of the given puzzles shall test the participants by different rules and methods, and as a collective, the series may *beware* lead to madness.",
	 										 "The event shall consist of the following puzzles, the rules and examples of which are provided in the given links-\n\n•SkyScrapers\n(A 6*6 skyscraper will be used)(difficulty level- unknown)\n•Bridges\n(A 15*15 puzzle will be given)(difficulty level- unknown)\n•Word Search\n(difficulty level- unknown)\nThe three puzzles shall be provided all at once and a timer shall be set up and started. The first three participants to complete the set up, or the highest scorers at the end of the timer shall be declared winners.\nThe scoring pattern will be declared on spot, and the judge’s decision shall be considered final.",
	 										 "Rs 50 PER HEAD",
	 										 "Saransh Gupta- +918800844282"
	 									  },
	 									  {
		 										 "The event shall be conducted in 3 rounds:\n•Round 1 : Round one shall be a knockout qualifier round reducing the number of participants by half. The participants shall be judged upon according to the time he/she spends solving the rubik’s cube in question.\n•Round 2 : This round has been added to test the participant’s logical ability to solve the cube in the minimum possible moves. The participants shall be allowed 2 chances with the cube and the best score shall be selected. A selected number of participants shall then pass to the next and final round.\n•Round 3 : This is the final round of the event. The participants shall be allowed three chances with the cube and the average time taken shall the calculated. The fastest shall be declared the winner.",
		 										 "Rs 50 PER PERSON",
		 										 "Ishant Singh - +918750518699 \n Zubair Ansari- +91 7503245262"
	 									  },
	 									  {
		 										 "Rules are applicable as in international standard with a fix amount of time per move.",
		 										 "Rs 50 PER PERSON",
		 										"Saransh Gupta- +918800844282"
	 									  },
	 									  {
		 										 "Sounds familiar, does it? Yes, the age old charming game is back and the rules are the same as ever.\n\nThe objective is to fill a 9×9 grid with digits so that each column, each row, and each of the nine 3×3 sub-grids that compose the solution contain all of the digits from 1 to 9. The puzzle setter will be providing a partially completed grid, which for a well-posed puzzle has a unique solution.  The same single integer may not appear twice in the same row, column or in any of the nine 3×3 sub-regions of the 9×9 playing board.",
		 										 "Rs 50 per Head",
		 										 "Saransh Gupta- +918800844282"
	 									  },
	 									  {
		 										 "Do you love Sherlock Holmes? Do you think Clues is the coolest show on TV? Then this is just for you! Try to unravel the hidden clues. Find out and solve these clues sequentially to lead yourself to the final treasure!!!! A treasure hunt for the Byomkesh Bakshi’s of our time!!!",
		 										 "Our treasure hunts are information-based scavenger hunts, or puzzle hunts, in which teams use their collective brainpower to solve clues.  Each team is presented with a group of puzzles, or clues, which teams must solve in order to find a piece of information.\nThe information in the clue could be words from a historical incident, a series of numbers or an address, a landmark, may be technology related or encrypted words or any other unique item that many of us walking down the street might merely pass by, unless we were looking for it.",
		 										 "The HUNT consists of 6 rounds:\n\n1.Worthy Enough???:\nThis will be a knockout round. This will be a one on one competition. Each team will be provided with a team I.D. and an envelope consisting of certain clues. Clues will be different for different sets of teams. The clues will lead the teams to their respective locations where they will find another envelope. This round will take place on the first day of Metacognition.\nThe winning teams qualify for the next round happening on the next day.\n\n2.The Beginning:\nQualified teams are provided with clues which are different for every team. Clues will lead to an envelope. The envelope leads you to your next location. Roughly the first 60% of teams to complete this round will qualify for the next round.\n\n3.Hunting Continues:\nSame procedure as round 2 is followed here with an increased difficulty level. Here, first 70% of the teams to complete their task qualify for the next round.\n\n4.Let the Real Game Begin:\nThe real competition starts now. Your team ID will be used from here.\n\nThe clues provided will lead you to your next location where THE PROTECTOR  awaits you. You have to show him your team ID and if you are on a right path the protector will ask for the password??? You will then report to the organisers and they will provide you with an encrypted password and you have to decrypt it. You will then tell the decrypted password to THE PROTECTOR and he will lead you to the next location.\n\nHere, last 10% of the qualified teams will be eliminated.\n\n5.True Hunters:\nNo eliminations from now\n\nIf you are last in this round then also no worries. You are stillin the game because life is all about a second chance.\n\nHere, the qualified teams are required to find out the location from the clue provided in the last round. At the location, the PROTECTOR awaits you. He will provide you the clues to the final location.\n\nNote: No need to come to the organisers\n\n6.Final Hunt:\nThe Grand Finale..!!!\n\nThe last barrier remains…..\n\nYou have to solve the clues and decrypt the FINAL PASSWORDprovided at the final destination and unlock the GOLDEN GATE.\n\nThis event is all about putting in efforts and showing teamwork to acquire the treasure box after crossing various hurdles in way. GOOD LUCK…!!!",
		 										 "1.Each team must consist of 5 members.\n2.Every team must report to the organisers after each round.\n3.No contact is allowed between teams. If found, then the concerned teams will be immediately disqualified.\n4.The first to unlock the GOLDEN GATE is the ultimate winner.\n5.In case of any dispute the verdict of the organisers will be final.\n",
		 										 "₹50 per team member",
		 										 "Kushagra- 9540440479 \n Anand Bajpai- 8826765073 "
	 									  },
	 								
	 								  },
	 								  {
	 									  {
	 										  "This event is for those enthusiastic aspirants who are willing to brush up their skills in the spectrum of general aptitude in the style of C. This event will give a chance to participants to prove their capabilities and sharpen their skills.\n\nAreas Covered: general aptitude, basic C programming, C syntax mania aptitude solving with C. (Turbo C compiler will be used)",
	 										  "This event will comprise of two levels:\n\nRound-1 will comprise of 20 questions of basic C programming and basic aptitude. The candidates who will qualify the level-1 will be eligible to participate in the level-2.\n\nRound-2 will comprise of 10 questions of solving high level aptitude questions either with the direct aptitude logic or C code implementation. The format of the C code to be implemented will be provided.\n\nCutoff will be based upon minimum time taken and the maximum no. of question solved.\nMax. Time Limit for First Round: 40 min\nMax. Time Limit for second Round: 60 min\n\nSpecific rules will be followed for qualifying the rounds and to handle the situation of a tie.\n\n",
	 										  "Rs 50 per participant",
	 										  "Pratikshit- 9650263230 \n Prateek- 9899466539 \n Rohit- 9873966332"
	 									  },
	 									  {
	 										  "When you come to think of it, God must love coding; decision-making, His favourite aspect of it- visible in all his programmes. Programming, in its essence, is not different from any other art-form, getting subjective inspiration from an object and creating something from your side. Taking up challenges and producing results.\n At Code Cocinero, we aim to bring out the competitive coder in you. It consists of two rounds. The preliminary round has three programmes which are to be compiled and run in an hour’s time. The highest scorers shall qualify for the next round. In case of a tie, the one with the better time shall be advanced. The final round shall last for two hours and three programmes. The winners shall be decided as per the aforesaid rules."
	 									  },
	 									  {
	 										  "It is an open challenge to the genius minds in the world of Coding to prove their mettle and decipher the answers to questions presented to them. The areas covered while designing the challenges that include basics such as Iteration,Operators,String,File Handling etc",
	 										  "\n•Round 1. Basic coding questions which will last for 45 minutes.\n•Round 2. Faulty codes with bugs will be provided to the  participants who shall be expected to find the bug in the code and then present it to the volunteer present without any compilation error.\nTime Duration: 30 minutes\n•Round 3. The 3rd section will consist of some hard algorithmic coding problems.For this section participants would be given 60 mins.",
	 										  "Programming languages used will be C,C++ and JAVA.\nNo time constraints will be set for any of the problems so there will be no need to worry about the TLE(TIME LIMIT EXCEEDED) error.\nCompiler used will be GNU-GCC.It’s the same compiler used in coding sites such as Codechef and Spoj .Participants should know the difference between this compiler and TURBO C++.",
	 										  "Rs 100 PER HEAD",
	 										  "Vibhav Singh- 9899279446"
	 									  },
	 									  {
	 										  "Here we go. Once again with a new set of levels, the game is back. Hidden file , images, texts, many ways of hiding the password used to make the game even better than before. The zipped files contain the hint of the password of the next level. Contestant need to hit the correct password to get past through to the next level.",
	 										  "\n•There are two rounds in the game, each round consisting of 10 levels each.\n•Each level consist of a password protected “.rar�? files. The “.rar�? files contain some hidden files and hints which a contestants exploits to detect the password of the next level.\n•Hints provided in each level can be encrypted in any format, that may employ cryptography , steganography, etc. The contestant need to decode the password from these hints.",
	 										  "\n•Time Duration for Round 1 is 30 minutes.\n•The players unzipping the maximum number of “.rar�? files in minimum time will be promoted to round 2.\n•Time Duration for Round 2 is 45 minutes.\n•Round 2 again consists of 10 levels.\n•Contestant clearing the maximum number of level would be declared as Winner (“Hurray, You did it!!!�?).\n•The time duration of each level for every contestant will be kept in record. In case of a clash between two or more players for clearing equal number of levels, the relative time taken to clear the level would be compared and the player with the minimum time would be promoted to the next level.",
	 										  "Rs 100 PER HEAD",
	 										  "Kartik Manas Srivastava \n Harshita Mishra"
	 									  },
	 									  {
	 										  "Mind boggling quiz that will boost up your interest in coding.the quiz would test your knowledge in object oriented programming.\nParticipants who will clear round 1 will be eligible for round 2.\nThe participants will have to find output for the desired program.\nJava geeks get ready to test your programming skills,there is your chance.\nCompete to make a java program for your given question.",
	 										  "Rs 50 PER HEAD",
	 										  "Abhishek Bajaj- 8586830669"
	 										  
	 										  
	 									  }
	 								  },
	 								  {
	 									  {"Team has to build an autonomous robot that can follow the motion of the source robot   (mechanical bot) on a given path without ever colliding with the leading bot.",
	 										  "1.The line arena consists of a white colour background with a line of black colour(3 cm width).\n2.The line course starts inside the starting arena and ends inside the exit arena.\n3.There shall be crossovers (may be loop also).\n4.The line course may have sharp right anglen\n5.The autonomous bot must fit into box of dimension 300mmX250mm.\n6.It must have an on board power supply and must not be more than 12 v. At most 3 sensors can be used.",
	 										  "1.The bot must be autonomous.\n2.It should not receive any inputs from the outside the arena.",
	 										  "1.At the start of the task, the bot will be placed at the starting point. Only 1 member from the team is allowed to be near the game field while starting the bot.\n2.The mechanical bot will be controlled manually.\n3.Robot should stop in a range of 15-20cm(distance is measured from leader robot) from the leader robot.\n4.Stopping at each cm either side of the range will be cause of point loss. The robot which will stop in range will be awarded .\n5.Deflection from the path will cause a point loss.\n6.Colliding with leader robot will reduce the point.\n7.At most 2 chances will be given in one round.",
	 										  "1.Max no. of participants per team should be 4, though a singular participation is also appreciated.\n2.Every team must have some team name and registration number that will be issued by us.\n3.Students of different educational institutes can take part together.",
	 										  "1.The robot will be penalized if any member of the team touches it after the task is started.\n2.The robot should not leave the chase at any point of time during the task or else it will be penalized.\n3.Any robot not conforming to the given specifications will be instantly disqualified.\n4.Any robot that damages the arena will be disqualified.\n5.Any team not present at the allotted time will be disqualified by default.",
	 										  "300 per team",
	 										  "SUNNY YADAV-9650379367 \n SHIVA AGRAWAL-8130611697"
	 										  },
	 										  {"•Aim:\nMake a black line following robot. The time taken by the bot to traverse through the course will be one of the concrete criteria for determining the winner. The lesser the time taken the better the points gained by the bot. If nobody finish the run, the farthest one run on tracks with maximum points will win.\n\n•Bot Specifications:\nMaximum size of a robot : 25*25*25 cm.\nMaximum weight : 3 kg (Note: Dimensional and weight limits for robots shall be strictly enforced. Robots will have to pass inspection prior to competing. The robot has to be completely autonomous. Once a robot has crossed the starting line it must remain fully autonomous, or it will be disqualified.\n•Course Specifications:\nThe line shall be black, 30 mm wide.\n\nThere shall be a starting area at the beginning of the course and an exit area at the end. The line course starts inside the starting area and ends inside the exit area. The start and end points of the line course shall be clearly marked via a transverse line.\nSharp angles may occur and the tracks may also be composed of some curves and broken lines, hurdles, obstacle (motile or non-motile both).\n",
	 											  "•A team can have 2 – 3 members, out of which maximum of 1 can be allowed in the arena.\n•The event will be conducted in two level, and top 5 teams in the leader board will be eligible for the final round.\n•Once a robot has crossed the starting line it must remain fully autonomous, or it will be disqualified.\n•Any robot that loses the line course must reacquire the line at the previous Checkpoint where it was lost, or at any earlier (e.g. already traversed Checkpoint).\n•Bot must not lose any parts in the arena or collide with any other bot during the competitions, this will lead to disqualification.\n\n••Battery and Power: The robot can be powered electrically only. The electric voltage between 2 points anywhere in the robot should not be more than 12 V DC at any point of time. All efforts must be made to protect battery terminals from a direct short and causing a battery fire, failure to do so will cause direct disqualification.",
	 											  "Rs 300 per team",
	 											  "Pratee- 8004422481 \nDhananjay -8447186770 "
	 											  },
	 											  {"Does your robot have ability to rule the world? It’s the time to prove it…\nPresenting, an incinerating zone of terror for robots, Real steel– The Robo War.\nA scintillating war of Robots. So be ready to fight, conquer, defeat and rule a kingdom full of threats.\nHere you will have to eliminate the other team by fighting with a warrior robot.\n",
	 												  "•Robot Size\nAt starting position, Robot must fit into a box of size 60cm X 60cm X 60cm and maximum permitted weight of bot is 60kgs.\n•Power Specification\nThe maximum D.C. voltage supply at any time must not exceed 24V onboard.\nAn external 220V AC will be provided.\n•Note : Any team using any different form of energy must make the necessary arrangement on their own. They must confirm it with organizers beforehand for safety reasons.\n•Weapon Specification\nEach Robot must possess at least one attacking weapon.\nBefore the beginning of any round the robots will be tested for safety and maximum size and weight criterion.\n",
	 												  "•A team can consist of a maximum 6 participants. Each participant must have a valid college identity card. The round finishes at the end of 3 minutes or when one team knocks out the opposing team, whichever occurs first.\n•In each case the Robot must start from given starting dimension. The timer would be stopped for rearranging positions.\n•Use of any mechanism that damages the arena would lead to disqualification.\n•Dragging the wired Robot once it is placed on the track may lead to disqualification.\n•Fire, water, chemicals are not to be used as weapons.\n•Lego kits/parts are not allowed.\n•There may be simple amendments to the rules which will be announced before starting the game.\n•The decisions of judges will be final and binding.\n•Judges and organizers reserve the right to modify the rules. Participants are required to check for the updates.",
	 												  "There will be a ROUND ROBIN type tournament. Every team will battle every other team in the tournament. In the end, two teams with maximum points will be selected to play final. The final battle will decide the winner.\n\n\n•Game\n\nThe event will be played in three rounds of 3 minutes each.\nIn each round, both teams battle their bots in the arena. The team who wins the max rounds is declared as the winner\n\n•POINTS:\n10 points for winning a round\n\n5 point for a draw\n\n0 point for losing a round\n\n1 point for a significant hit with weapon.\n\nNOTE: Only significant hit will be considered for a point. It is decided by the judges .\nA team wins if  : \nIt knocks out the opponent out of the arena.\nElse if the other team is made non operational for 20 seconds\nElse if it has more points than other team at the end of round after 3 minutes.\nIt fulfills the given round qualifying conditions :\nElse the team with best design wins which will be decided by judges on the basis of innovative weapon, better strategy, good mobility and efficient controls.",
	 												  "Rs 500 PER TEAM",
	 												  "ABHAY - +919990396887 \nANKUR: -99548044440\nCHHAYANK: +919871671660"},
	 											  {
	 												  "Each team have to build a manual robot capable for racing.",
	 												  "•It will be a time trial.\n•There will be two rounds – Prelims and Finals\n•The bot will have to begin from the starting point and make its way towards the finish line overcoming all the obstacles on its way\n•The maximum allowed time will be told at the time of event.\n•The team can skip an obstacle but with an addition of time penalty of 15 seconds in the total time taken.",
	 												  "•Points awarded for different checkpoints can be different for different obstacle depending upon the level of toughness of the obstacle)\n•Restarting at an obstacle or skipping it is permitted and is always an option.\n•-50 for each restart\n•+100 for crossing the obstacle.\n•-120 for skipping\n•+300 for completing the whole arena.\n•We can give time option means for completing the arena in a particular time interval we can award points on that.",
	 												  "•The team will be provided with a 220V,50Hz supply.\n•The bot can be run on both power sources A.C.(Provided by the organizers) or D.C.(The participating team will have to arrange for it)\n•The dimensions of the bot should not be greater than 30*25*25 cm.\n•The bots can be powered both on board or off board.\n•The bot should be water resistant enough to not face a problem while crossing muddy spots.\n•Ready-made chassis are strictly not allowed, the chassis should be handmade (Co ordinators will be strict in this aspect).",
	 												  " 300 per team",
	 												  		"SYED GHULAM ASKARI- +919891084587"
	 														  }
	 								  }
			 						};
	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;
	
	
	public static Description_page newInstance() {
		return new Description_page();
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_item_one, container, false);
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getChildFragmentManager());
		
		mViewPager = (ViewPager) v.findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		 posi=getArguments().getInt("POSI");
	       m1=(posi/10);
	       m2=posi%10;
	       mSectionsPagerAdapter.notifyDataSetChanged();
		return v;
	}
	
	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public int getItemPosition(Object object) {
		    return POSITION_NONE;
		}
		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a DummySectionFragment (defined as a static inner class
			// below) with the page number as its lone argument.
			Fragment fragment = new DummySectionFragment();
			Bundle args = new Bundle();
			args.putString("POSS", position+"");
			args.putInt("m1", m1);
			args.putInt("m2", m2);
			args.putInt("count", events_title[m1][m2].length);
			args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position +1);
						fragment.setArguments(args);
						fragment.setArguments(args);
						return fragment;
						
						
		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return events_title[m1][m2].length;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			/*switch (position) {
			case 0:
				return events_title[m1][m2][0].toUpperCase(l);
			case 1:
				return events_title[m1][m2][1].toUpperCase(l);
			
			}*/
			for(int i=0;i<events_title[m1][m2].length;i++)
			{
				if(i==position)
				{
					return events_title[m1][m2][i].toUpperCase(l);
				}
			}
			
			return null;
		}
	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public static class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		ListView list;
		//ProgressDialog mProgressDialog;
		 String[][][] problemstatement={
				  {
					  {
					   "A Quiz designed to test your logical and reasoning ability on the basis of existing knowledge of scientific theories. The quiz tests the participant’s ability to identify whether the given theory is Legitimate or a Hoax. The name of this event is science hoax.",
					   "A team consisting of three members or less is required in order to participate. A qualifying round will be conducted on a preliminary basis. In this entrance round a multiple choice questionnaire containing 20 questions testing simple physics theories (Class 9 to 12). The Top Ten Teams will qualify for the stage rounds. \n The second round is divided into 3 phases. Each phase will consist of one full clock or anti clockwise cycle of quizzing. The first phase is simple, “Relatively�? speaking. Each team will be asked a question and the team has to answer whether the given theory is a hoax or not and if it is a hoax then they will be required to give an explanation. Don’t worry hoaxes will be simple (can be answered in 5 seconds if the participants are familiar with the theory). The second phase will be a visual round. A picture depicting a hoax will be shown; the participants have to identify the hoax. In both these phases you will be rewarded with credits for a correct answer only. No points or negative marks on the wrong answer; Bonus points will be awarded if the passed question is answered correctly. The third phase is a buzzer round. There will be ten questions; the team to press the buzzer first will attempt the question. \n After the second round the bottom 5 teams will be eliminated. The top 5 teams will now compete for the cash prize. The Third round’s difficulty level is a little higher than the previous rounds. Herein there will be two cycles of questioning. Various hoax containing scientific fields will be shown to the participants. A field has to be selected; The participants will then attempt a hoax on the respective field. (Hoax can be explained in 10 seconds).\n At the end, as per the cumulative score of each team starting from the second round, the winner will be decided. \nThere must be one member in a team."+"\n"+"A member can be of different college."+"\n"+"No need to carry their own resource such as pc, we’ll provide you. ."+"\n"+"Two rounds will be held."+"Round1 :- Is the objective round where participating member answer the question"+" \n"+"Round2:- Is the objective round where participating member perform the operation of java language."+" \n"+"Limited time will be given for doing the task."+" \n"+"Members will be eliminated after first round."+" \n"+"Participants are not allowed to take help from internet or any other resource.",
					   "₹100 per team",
					   "SARANSH GUPTA"," 8800844282 "
						 
					  },
					  {
						"Mathematics is the language of nature. God used beautiful mathematics in creating the world. Without mathematics, there’s nothing you can do. Everything around you is mathematics. Everything around you is numbers. It is a play that starts with ‘zero’ and tends to infinity. Mathematics has beauty and romance. It’s not a boring place to be, the mathematical world. It’s an extraordinary place; it’s worth spending time there. \n Here is an opportunity in METACOGNITION’15 to play with Mathematics. We invite you to participate in “AMUSING MATH�? and test your mathematical skills.",
						"This event can be participated by a team of two or individually. The event comprises of 3 rounds. \n \n ROUND 1:\n This round consists of 30 objective type questions. Each team will be given only 30 minutes time. Each write answer will give you 3 marks and 1 mark will be deducted for every wrong answer. No mark will be given or deducted for not answering the question. \n In this round, the questions will test your basic mathematics, reasoning capabilities, ‘General Knowledge’ of Mathematics, Mathematicians etc.\n The top 20% – 25% Teams will be taken into the second round. \n ROUND 2: \n This is a puzzle round where the teams are supposed to solve Mathematical puzzles in the given time. The top few teams will be finalized in this round. \nROUND 3: \n This round will consist of 5 subjective questions. Step marking will be done in this round. The team to get maximum marks wins. \n",
						"₹100 per team",
						"Kushagra Sharan,Kumar Shubham"," +919540440479,918588820627"
					  }
				  },
				  {
					 {
						 "Crazy about spellings: Check \n Proclaims to be a grammar nazi: Check\n Pro at pronunciations : Check \n Hey, you – Mr.Ross Gellar. \n In this fray among the best of bests, lets see who sets the stage ablaze. \nLights. Camera. Fire. WORDS. \n And as the flame of the grammar nazis’ scorches the skies in this war of words, we welcome you to the battle of Spellathon, at Metacognition’15. See you there!",
						 "•The pronouncer will pronounce the word and the speller has to spell it. It is to be noted that the speller is expected to pronounce the word before spelling it so that the pronouncer can be assured that the speller heard it right. Also, after spelling the word, the speller will be expected to again pronounce it so that the judges can know that the speller is done.\n•The speller may ask the pronouncer to pronounce the word again, define it or use it in a sentence. Judges may disqualify any speller who ignores the request to start spelling.\n•Having started to spell a word, a speller may stop and start over, retracing the spelling from the beginning. But during this course, the speller is not allowed to change the sequence of the letters from those, first spelled. So, a speller cannot correct himself or herself, even while it is still his or her turn.\n•The contest will be conducted in rounds. Each speller, remaining in each round will spell one word in the round, except when there are two spellers remaining.\n•If a word has one or more homonyms, the pronouncer will indicate which word is to be spelled, either by defining it or by using it in a sentence. If the pronounced word is not properly identified by the speller, correct spelling of any homonym of the word will be accepted.\n•When the number of spellers are reduced to two, the rule changes. When one speller misspells a word, the other speller will get the opportunity to spell the same word. If the second speller spells that word correctly and the next word on the pronouncer’s list, the second speller shall be the winner.\n•If the second speller is unable to spell the word, the word is again passed on to the first speller. If he or she spells the word passed and the word given to him or her on his own turn, then the first speller will be declared as the winner. If both the spellers, misspell the word, then another round takes place as earlier discussed.\n•Protest may be filed by anyone wishing to reinstate a speller into the contest but will not be heard from \n•any individual seeking to dislodge another speller from the competition. Deadline for filing a protest is before the speller affected would have received his or her word and he or she stayed into the contest.\n•Protest should be verbally made to a designated person immediately or upon completion of a round.\n•Judges are the controller of the contest. Their decisions are final.\n•Please have fun and relax.",
						 "INR 30 PER HEAD",
						 "Ronit","+918004084550"
					  },
					 {
						  "Are you spontaneous enough to face the grammar Nazis, the chatter boxes and the I-Do-Not-Stammer-At-All sorts in a battle of two minute? Well, if yes, come and fight it out among a medley of people in this battle of wits and brains at our impromptu gig, Extempore.",
						  "Each participant will be given a total time of two minutes. One minute for introspecting the topic and the other one minute for speaking. Contestants will have to speak on the topic without hesitation, stammering and repetition. Speakers at all times must be grammatically and factually correct and must speak within the confines of the given topic. A small bell will ring after 45 seconds of the speaking time. The speaking time will include a brief introduction of the speaker. \n A second round can take place, if there is a tie between two speakers. The decision of the organising committee is final, in case of any dispute.",
						  "•English should be the language of communication \n •Speech notes are not permitted during the time of the speech. Cue and palm cards are however permitted. However, their use should not hamper the speaker’s visual engagement with the audience. \n•Participants must carry their own pens.\n •Discipline is of prime importance.",
						  "Rs 50 PER HEAD",
						  "Soman,Siddharth","+918527787397,+918287683957"
						  
						  
					},
					{
						"In this carnival of the tech-enthusiasts, the geeks, the technocrats and so many more, we present to you the Debate competition. \n Contemplate. Cogitate. Contest.",
						"Present your debating  skills",
						"•It will be an oxford style debate conducted in two rounds.\n•Eight teams will qualify for the finals to be held on the second day.\n•Structure of the Event: Each speaker gets a floor time of three minutes. There will be two interjections, following the speech of every speaker, either from the judges or the audience.\n•The topic for the first round is “India or west, the land of opportunities�?\n•The topic for the Final round will be announced on the day of the first round itself.\n•",
						"1.Maximum time limit for  speaking -3 min \n2.No use of abusive words in the speaking content .\n3.Students shall be given time to pen down their ideas on paper sheets will be provided, and collected at the end of the event.",
						"•Negative marks will be awarded for exceeding the time limit.\n•Extra marks will be awarded for the body language /confidence/speaking skills.\n•Extra points will be awarded for strong points /views /relevant statistical data involved in the content.\n•Plus points for completely sticking on topic  like the for/against  the motion.",
						"Rs 50 PER HEAD",
						"Soman, Siddharth"," +918527787397 ,+918287683957"

					}
				  },
				  {
					  {
						  "Do you really brag about your aided graphical skills or think you are an efficient and smart designer?\nThen it is time to prove yourself at a game of both skills and speed.",
						  "1.You would be asked to design in two levels.\n2.The platform given would be AUTOCAD or AUTODESK INVENTOR, and it’s your choice to choose one.\n3.The level 1 comprises of a design or a task that has to be completed in a given time. Failing prompt will make you disqualified.\n4.The level 2 comprises of another given design task, the one who does it first shall be declared victor..\n5.Any cheating or misconduct would lead to disqualification.",
						  "Rs. 80",
						  "Abhay"," +919990396887"
					  },
					  {
						  "Ever wondered how some great short movies like ‘Land without bread’ or the recent ‘TVF Pichers’ were made by a bunch of inexperienced guys on the lukewarm days of holiday. So now is the time to shred the wonder-struck face,take a camera(maybe a 5MP one), and show the world what you want them to. Take a camera(or a phone), and trek across our campus.\n Capture videos, or photos and join them.\nAdd effects and then submit it to us and we’ll provide you the platform to flaunt what is yours.\n",
						  "1)You need to make a picturesque presentation of your campus. It can be a campus tour video or a slideshow of snaps.Edit them the way you like, add music,add after effects.\n3)Take care of the maximum time limit of 5 minutes.\n3)No bar on use of editing software. Any, and all elements are allowed.\n4)Once prepared, send us the video through the official fb metacognition page i.e www.fb.com/metacognitionfest, with your Team’s name followed by the details of its members.\n5)Final decision will be taken by judges after watching the video.There will be NO JUDGEMENT based on the LIKES, or COMMENTS a video gets.\n6)Each team has to submit a fees of 50/­ to the contact given at the end.\n7)The last date for the submission of the video is 1st October,failing to which no entries shall be accepted.\n8)The team with the best video will get a cash prize along with exciting goodies in the days of the festival.\n",
						   "Vibhav,Vikash,Kushagra"," 9899279446,8285872278,8765550098"
					  },
					  {
						  "Topic for the event: To be provided on the spot",
						  "\n•The coordinators will provide you with a sheet of A4 sized paper.\n•You are requested to carry your own toolkit which may include pencils, erasers, sketch-pens, crayons and/or pencil colors. Any form of paint colors are prohibited in the event.\n•The purpose of the event is to draw, and create an original advertisement on the provided topic using the allowed methods.\n•The artwork shall be marked on the grounds of its originality, meaningfulness and humor or any other meaning attached to it.\n•The judge’s decision on the scorecard shall be the final assessment of the event.",
						  "Rs 50",
						  "Kumar Shubham,AnkitSrivastava,KushagarSharan","8588820627 ,9899098262, 9540440479"
						  
					  },
					  {
						  "Design a logo of our technical fest METACOGNITION and mail the same to our email id: teamenthiran@gmail.com by the end of the festival along with your contact details.. The best among the entries shall be declared as winner.",
						  "FREE OF COST",
						  "SARANSH GUPTA"," 8800844282 "
					  }
				  },
				  { {"•Tournament will base on Knock out concept.\n•Winner shall be decided by the best of 3 matches.",
						 "Rs.50 PER HEAD",
						 "Gaurav Idnani,Arjun Succena,Tejas Vyas","8447824581,9971062902,9810914613"},
					{"Call of duty : Modern Warfare Tournament \nFree For all \n Map : 1) Shipment (rounds) \n2) Downpour( final )",
							 "Time limit : 10 minutes \nScore limit : Unlimited",
							 "Number of lives : Unlimited \nRespawn delay : None\nMax health : Normal\nHealth Regeneration : Normal\nKillcam : Disabled\n",
							 "Headshots Only : Disabled \nPerks : Disabled\nKillstreak Rewards : Disabled\nHardcore Mode : Disabled\n3rd Person : Disabled\n",
							 "Grenadier \nFirst Recon\nOverwatch",
							"Rs.50 PER HEAD",
							"Gaurav Idnani,Arjun Succena,Tejas Vyas","8447824581,9971062902,9810914613"
					},
					{"Game Version – most wanted \n1).General rules\nThere will be 3 rounds in total\n– 1st round\nElimination round\nThe players will be competing in groups of 4 for lap knockout races. Winner will move to the next round.\n 2nd Round\nThe players will be competing in groups of 4 for sprint races. Winner will move to next round\n– 3rd round(optional)\nIf more than 4 players are there to compete. They will face each other in circuit races of 2 laps. Time to be added up.\n– Final round\nBest of 3\n3 races (drag, sprint ,and circuit race)\nWinner of 2 races is going to grab prize money .\n2).Other Rules –\nOther controllers, steering wheels are not allowed.\nKeyboards can be brought.\nEarphones/headphones will not be provided. Participants have to bring their own earphones/headphones.\nAt the end of each match,players must maintain the final screens and receive confirmation.\n",
						"Track Direction:Forward \nLaps:3(Final and the Semifinals) Nitro:On\nCollision Detection:on\nPerformance Matching:on\nMaximum Number of Players 4\nCar Damage:on\nThe best part !…..yeah we havent told you about cars yet.\nFully modded cars (in game version and out game version) will be there to drive !\nPerformance matching on so no worries..\nSo gear up guys ! Pick your ride and show us what have you got ! Cuz its gonna be hell lot different and absolutely on a higher level this time.\nGAME ON ! ITS GUTS TO GLORY\n",
						"Rs.50 PER HEAD",
						"Gaurav Idnani,Arjun Succena,Tejas Vyas","8447824581,9971062902,9810914613"
						},
					{"•Game Version: Counter-Strike Source\n•Competition Method : 5 vs. 5 (Team Play, 5 players per team)\n•As a default 1 mouse and 1 keyboard will be provided for all players other than that players can bring their own mouse,keyboard and headphones.\n•Rounds: 10 Rounds (Max rounds format): 5 rounds as Terrorists and 5 rounds as Counter-Terrorists per team (If a team scores 6 rounds first, the match is ended immediately.)\n•Victory Condition: The first team to win 6rounds.\n•Round Time: 1 minute 45 seconds.\n•The team playing as the Terrorist side first will be announced before the match or decided by coin toss.\n•Team players can talk to each other during freeze time\n•In the case of a tie after the regulation rounds end, 2 extra rounds will be played. (1 rounds as Terrorists / 1 rounds as Counter-Terrorists per team) In the case of yet another tie 1 additional extra rounds will be played to break the tie the sides will be decided by a toss.\n•Official Maps: De_Dust2, De_Inferno, De_Nuke, De_Train\n•Team members must only use team message (messagemode2), while in a match.\n•At the end whatever the decision referee makes will be the final decision no objection will be tolerated on that",
							"•mp_autocrosshair 0\n•mp_buytime 0.25\n•mp_fadetoblack 1\n•mp_flashlight 1\n•mp_freezetime 15\n•mp_friendlyfire 1\n•mp_roundtime 1.75\n•mp_tkpunish 0\n•sv_cheats 0\n•sv_clipmode 0\n•sv_gravity 800\n•sv_lan_rate 25000\n•sv_maxrate 25000\n•sv_maxspeed 320\n•sv_maxupdaterate 101",
							"•Any player or team caught breaking a rule or performing an infraction will be subject to either a warning, at the minimum, or a forfeit loss, at the discretion of the referee.\n•When a player has died, he may communicate verbally with other players, but he must remove his hands from his keyboard and mouse until the beginning of the next round.\n•A player is deemed dead when the screen is completely faded to black.\n•If a player touches his mouse or keyboard while dead, the team will be subject to either a warning, at the minimum, or a forfeit loss, at the discretion of the referee.\n•The use of ‘SKY Box’ will result in a loss by default for the offending team.\n•If the refree decides that external conditions (Press, Team Leader, Player, Spectator, etc) give unfair advantage to a player, the team may be given a warning or lose by default at the referee’s sole discretion.",
							"Gaurav Idnani,Arjun Succena,Tejas Vyas","8447824581,9971062902,9810914613"
							},
					{"GOOOOAAAALLLL! – The exclusive FIFA  tournament at METACOGNITION\n\nGOOOOAAAALLLL! is a gaming event, at GALGOTIAS COLLEGE OF ENGINEERING AND TECHNOLOGY,annual TECHFEST ‘METACOGNITION’. EA Sports’ annual edition of the FIFA game, FIFA 14, will be played at the event, on LAPTOP And CONSOLE. Players from various colleges may register, play and stand a chance to win prizes, if victorious over the two day event. Players will go through the range of emotion every football fan in a stadium goes through, only this time, they’re in control of their beloved teams’ fortunes. The event promises to be a test of skill, grit, calmness and so much more.",
								"° Tournament is a single player versus single player only.\n° No two keyboard players will play against each other\n° Registrations can be made prior to the tournament and on the spot as well.\n° The duration of every game is 6-minutes a half.\n° The weather will always be set to clear.\n° The squads are updated and updated as per the transfer window.\n° The Qualifying rounds will have normal time and golden goal\n° The Final rounds will have extra time after normal time followed by penalties if the scores are tied.\n° World XI, Classic XI and are not allowed.\n° As per online regulations only tactical defending is allowed, this in keeping with changing FIFA meta-game.\n° Custom tactics cannot be changed.\n° All players will receive a maximum of 3 minutes to complete their team management and three substitution breaks during the game to make changes or substitutions. Each of these three breaks will be for a maximum of 30 seconds.\n° Players can make changes only when the ball is out of play.\n° Pausing the ga oint without the prior permission of the organizers will lead to warning or disqualification depending on the effect caused due to the pause in play.\n° Camera, Visual, Audio and Game Brightness is set as default and will not be changed.\n° Wireless Controller settings can be changed to suit the player in any way he/she likes, but these changes will have to be made either in the 3 minutes allotted prior to the game or in one of the three 30 second breaks during.\n° A partcipant or any other person who damages the property of or pertaining to the tournament will be held liable, i.e. any fines or other amounts that arise due to such damage must be paid by the person who causes such damage.\n",
								"Rs.50 PER HEAD",
								"Gaurav Idnani,Arjun Succena,Tejas Vyas","8447824581,9971062902,9810914613"
								
								},
				  },
				  {
					  {
						  "There is one thing stronger than all the armies of the world, that is.. ‘An  IDEA’, whose time has come.",
						  "1.Any undergraduate  or  masters  student  of  any  discipline  is  eligible  to  participate  in  this event. However PhD students and research scholars are not allowed to present their papers. \n 2.Each team may have a maximum of four members.\n3.No team is allowed to send more than one entry for the same departmental cell, but you are free to send multiple entries provided your papers are related to different cells.\n4.This event  will  be  conducted  in two  stages and  its  detailed  procedure  has been  clarified below.",
						  "Abstract Submissions \n \n Topic – ( Effective usage of Energy and Energy Production ) \n \n1) Participants are needed to send in the abstract of the original/review work including the references, the idea proposed with figures (if needed) to teamenthiran@gmail.com \n2) Abstract should not exceed 500 words and the covering page of the abstract must have Name(s), Institution of study, Email address(es), Contact number(s), Name of the cell you wish  to  present  the  paper  in,  Topic of  paper  presentation  & registration details.\n3)  Your  email  should  have  the  category  name  as  your  subject  and  your  file  name  should have the title of the concerned paper.For Example, a paper on simulation of a Hydrocracker unit in a refinery unit should have its mail  subject  as  “IDEAZ:  Modelling,  Simulation,  Design  and  Process  Control:  GCET15/XXXXX�? and its title as “Simulation of Hydrocracker unit�?.\n4) Selection  to  the  next  round  for  final  presentations  will  be  based  on  the  abstract submitted.\n5)   Deadline for Abstract Submissions is 2nd october 2015.\n6) The result for the first round will be put up on the website till 6th october 2015 and will also be mailed to you.\n7) For  any  particular  queries  regarding paper  presentations,  please  contact  the  event coordinators.",
						  "Full Paper Submissions \n\nTopic – ( Effective usage of Energy and Energy Production )\n\nThe  second  round  will  be  conducted  at  GCET  during  METACOGNITION 2015  (10th-11thoctober2015). \n1) Participants should submit their full paper in “.doc�? and “.pdf�? format. You need to bring two  hard  copies of  your  complete  paper  (i.e.  printed  report)  &  two  passport  size photographs of each participant along with all the necessary details attached.\n2)  Formatting  rules  should  be  strictly  followed.  A font  type  of  Bookman  Old  Style  with  a font size of 12 should be kept.\n3)  Participants  should  ensure  that  their  papers  include  all  relevant  figures,  tables  and bibliography.\n4) Submissions, in any case, should not exceed 12 pages in length.",
						  "Topic – ( Effective usage of Energy and Energy Production )\n\n1) Final Presentations should be in “.ppt�?  format strictly and should be timed for 15 minutes (12 minutes for presentation and 3 minutes for Question and Answer round).\n2) The decision of the judges shall be final and binding.",
						  "1.The event consists of 100 points with report consisting of 60 points and presentation 40 points.\n2.The presentation time shall be 20 minutes.\n3.The teams have to wrap up the presentation within the given limits. A warning bell shall be issued two minute before the end of 20 minutes.\n4.Feasibility -> 20 points\n5.Innovativeness -> 15 points\n6.Design -> 15 points\n7.Discussion -> 10 points\n8.Presentation -> 40 points\n9.The decision of judges shall be considered as final.",
						  "The registration shall be done through the Metacognition website.\nRegistration Fee : Rs 200\n\nSteps\n\nEach member needs to register on the website. This will generate a unique meta ID.\nSubmit your entries and mail your queries to teamenthiran@gmail.com",
						  "Saransh Gupta"," +918800844282"
					  }
				  },
				  {
					  {
						 "This year we will play a newer game, a tougher one that tests us to degrees never experienced before.\nWelcome to the Warzone!!!",
						 "The game introduces a series of puzzles that had gone missing in the tides of time through various ancient Japanese cultures and societies. Each one of the given puzzles shall test the participants by different rules and methods, and as a collective, the series may *beware* lead to madness.",
						 "The event shall consist of the following puzzles, the rules and examples of which are provided in the given links-\n\n•SkyScrapers\n(A 6*6 skyscraper will be used)(difficulty level- unknown)\n•Bridges\n(A 15*15 puzzle will be given)(difficulty level- unknown)\n•Word Search\n(difficulty level- unknown)\nThe three puzzles shall be provided all at once and a timer shall be set up and started. The first three participants to complete the set up, or the highest scorers at the end of the timer shall be declared winners.\nThe scoring pattern will be declared on spot, and the judge’s decision shall be considered final.",
						 "Rs 50 PER HEAD",
						 "Saransh Gupta"," +918800844282"
					  },
					  {
							 "The event shall be conducted in 3 rounds:\n•Round 1 : Round one shall be a knockout qualifier round reducing the number of participants by half. The participants shall be judged upon according to the time he/she spends solving the rubik’s cube in question.\n•Round 2 : This round has been added to test the participant’s logical ability to solve the cube in the minimum possible moves. The participants shall be allowed 2 chances with the cube and the best score shall be selected. A selected number of participants shall then pass to the next and final round.\n•Round 3 : This is the final round of the event. The participants shall be allowed three chances with the cube and the average time taken shall the calculated. The fastest shall be declared the winner.",
							 "Rs 50 PER PERSON",
							 "Ishant Singh , Zubair Ansari"," +918750518699, +91 7503245262"
					  },
					  {
							 "Rules are applicable as in international standard with a fix amount of time per move.",
							 "Rs 50 PER PERSON",
							 "Saransh Gupta"," +918800844282"
					  },
					  {
							 "Sounds familiar, does it? Yes, the age old charming game is back and the rules are the same as ever.\n\nThe objective is to fill a 9×9 grid with digits so that each column, each row, and each of the nine 3×3 sub-grids that compose the solution contain all of the digits from 1 to 9. The puzzle setter will be providing a partially completed grid, which for a well-posed puzzle has a unique solution.  The same single integer may not appear twice in the same row, column or in any of the nine 3×3 sub-regions of the 9×9 playing board.",
							 "Rs 50 per Head",
							 "Saransh Gupta"," +918800844282"
					  },
					  {
							 "Do you love Sherlock Holmes? Do you think Clues is the coolest show on TV? Then this is just for you! Try to unravel the hidden clues. Find out and solve these clues sequentially to lead yourself to the final treasure!!!! A treasure hunt for the Byomkesh Bakshi’s of our time!!!",
							 "Our treasure hunts are information-based scavenger hunts, or puzzle hunts, in which teams use their collective brainpower to solve clues.  Each team is presented with a group of puzzles, or clues, which teams must solve in order to find a piece of information.\nThe information in the clue could be words from a historical incident, a series of numbers or an address, a landmark, may be technology related or encrypted words or any other unique item that many of us walking down the street might merely pass by, unless we were looking for it.",
							 "The HUNT consists of 6 rounds:\n\n1.Worthy Enough???:\nThis will be a knockout round. This will be a one on one competition. Each team will be provided with a team I.D. and an envelope consisting of certain clues. Clues will be different for different sets of teams. The clues will lead the teams to their respective locations where they will find another envelope. This round will take place on the first day of Metacognition.\nThe winning teams qualify for the next round happening on the next day.\n\n2.The Beginning:\nQualified teams are provided with clues which are different for every team. Clues will lead to an envelope. The envelope leads you to your next location. Roughly the first 60% of teams to complete this round will qualify for the next round.\n\n3.Hunting Continues:\nSame procedure as round 2 is followed here with an increased difficulty level. Here, first 70% of the teams to complete their task qualify for the next round.\n\n4.Let the Real Game Begin:\nThe real competition starts now. Your team ID will be used from here.\n\nThe clues provided will lead you to your next location where THE PROTECTOR  awaits you. You have to show him your team ID and if you are on a right path the protector will ask for the password??? You will then report to the organisers and they will provide you with an encrypted password and you have to decrypt it. You will then tell the decrypted password to THE PROTECTOR and he will lead you to the next location.\n\nHere, last 10% of the qualified teams will be eliminated.\n\n5.True Hunters:\nNo eliminations from now\n\nIf you are last in this round then also no worries. You are stillin the game because life is all about a second chance.\n\nHere, the qualified teams are required to find out the location from the clue provided in the last round. At the location, the PROTECTOR awaits you. He will provide you the clues to the final location.\n\nNote: No need to come to the organisers\n\n6.Final Hunt:\nThe Grand Finale..!!!\n\nThe last barrier remains…..\n\nYou have to solve the clues and decrypt the FINAL PASSWORDprovided at the final destination and unlock the GOLDEN GATE.\n\nThis event is all about putting in efforts and showing teamwork to acquire the treasure box after crossing various hurdles in way. GOOD LUCK…!!!",
							 "1.Each team must consist of 5 members.\n2.Every team must report to the organisers after each round.\n3.No contact is allowed between teams. If found, then the concerned teams will be immediately disqualified.\n4.The first to unlock the GOLDEN GATE is the ultimate winner.\n5.In case of any dispute the verdict of the organisers will be final.\n",
							 "₹50 per team member",
							 "Kushagra , Anand Bajpai ","9540440479,8826765073 "
					  },
				
				  },
				  {
					  {
						  "This event is for those enthusiastic aspirants who are willing to brush up their skills in the spectrum of general aptitude in the style of C. This event will give a chance to participants to prove their capabilities and sharpen their skills.\n\nAreas Covered: general aptitude, basic C programming, C syntax mania aptitude solving with C. (Turbo C compiler will be used)",
						  "This event will comprise of two levels:\n\nRound-1 will comprise of 20 questions of basic C programming and basic aptitude. The candidates who will qualify the level-1 will be eligible to participate in the level-2.\n\nRound-2 will comprise of 10 questions of solving high level aptitude questions either with the direct aptitude logic or C code implementation. The format of the C code to be implemented will be provided.\n\nCutoff will be based upon minimum time taken and the maximum no. of question solved.\nMax. Time Limit for First Round: 40 min\nMax. Time Limit for second Round: 60 min\n\nSpecific rules will be followed for qualifying the rounds and to handle the situation of a tie.\n\n",
						  "Rs 50 per participant",
						  "Pratikshit, Prateek,Rohit","9650263230 , 9899466539, 9873966332"
					  },
					  {
						  "When you come to think of it, God must love coding; decision-making, His favourite aspect of it- visible in all his programmes. Programming, in its essence, is not different from any other art-form, getting subjective inspiration from an object and creating something from your side. Taking up challenges and producing results.\n At Code Cocinero, we aim to bring out the competitive coder in you. It consists of two rounds. The preliminary round has three programmes which are to be compiled and run in an hour’s time. The highest scorers shall qualify for the next round. In case of a tie, the one with the better time shall be advanced. The final round shall last for two hours and three programmes. The winners shall be decided as per the aforesaid rules."
					  },
					  {
						  "It is an open challenge to the genius minds in the world of Coding to prove their mettle and decipher the answers to questions presented to them. The areas covered while designing the challenges that include basics such as Iteration,Operators,String,File Handling etc",
						  "\n•Round 1. Basic coding questions which will last for 45 minutes.\n•Round 2. Faulty codes with bugs will be provided to the  participants who shall be expected to find the bug in the code and then present it to the volunteer present without any compilation error.\nTime Duration: 30 minutes\n•Round 3. The 3rd section will consist of some hard algorithmic coding problems.For this section participants would be given 60 mins.",
						  "Programming languages used will be C,C++ and JAVA.\nNo time constraints will be set for any of the problems so there will be no need to worry about the TLE(TIME LIMIT EXCEEDED) error.\nCompiler used will be GNU-GCC.It’s the same compiler used in coding sites such as Codechef and Spoj .Participants should know the difference between this compiler and TURBO C++.",
						  "Rs 100 PER HEAD",
						  "Vibhav Singh"," 9899279446"
					  },
					  {
						  "Here we go. Once again with a new set of levels, the game is back. Hidden file , images, texts, many ways of hiding the password used to make the game even better than before. The zipped files contain the hint of the password of the next level. Contestant need to hit the correct password to get past through to the next level.",
						  "\n•There are two rounds in the game, each round consisting of 10 levels each.\n•Each level consist of a password protected “.rar�? files. The “.rar�? files contain some hidden files and hints which a contestants exploits to detect the password of the next level.\n•Hints provided in each level can be encrypted in any format, that may employ cryptography , steganography, etc. The contestant need to decode the password from these hints.",
						  "\n•Time Duration for Round 1 is 30 minutes.\n•The players unzipping the maximum number of “.rar�? files in minimum time will be promoted to round 2.\n•Time Duration for Round 2 is 45 minutes.\n•Round 2 again consists of 10 levels.\n•Contestant clearing the maximum number of level would be declared as Winner (“Hurray, You did it!!!�?).\n•The time duration of each level for every contestant will be kept in record. In case of a clash between two or more players for clearing equal number of levels, the relative time taken to clear the level would be compared and the player with the minimum time would be promoted to the next level.",
						  "Rs 100 PER HEAD",
						  "Kartik Manas Srivastava ,Harshita Mishra","9971087552,--"
					  },
					  {
						  "Mind boggling quiz that will boost up your interest in coding.the quiz would test your knowledge in object oriented programming.\nParticipants who will clear round 1 will be eligible for round 2.\nThe participants will have to find output for the desired program.\nJava geeks get ready to test your programming skills,there is your chance.\nCompete to make a java program for your given question.",
						  "Rs 50 PER HEAD",
						  "Abhishek Bajaj"," 8586830669"
						  
						  
					  }
				  },
				  {
					  {"Team has to build an autonomous robot that can follow the motion of the source robot   (mechanical bot) on a given path without ever colliding with the leading bot.",
							  "1.The line arena consists of a white colour background with a line of black colour(3 cm width).\n2.The line course starts inside the starting arena and ends inside the exit arena.\n3.There shall be crossovers (may be loop also).\n4.The line course may have sharp right anglen\n5.The autonomous bot must fit into box of dimension 300mmX250mm.\n6.It must have an on board power supply and must not be more than 12 v. At most 3 sensors can be used.",
							  "1.The bot must be autonomous.\n2.It should not receive any inputs from the outside the arena.",
							  "1.At the start of the task, the bot will be placed at the starting point. Only 1 member from the team is allowed to be near the game field while starting the bot.\n2.The mechanical bot will be controlled manually.\n3.Robot should stop in a range of 15-20cm(distance is measured from leader robot) from the leader robot.\n4.Stopping at each cm either side of the range will be cause of point loss. The robot which will stop in range will be awarded .\n5.Deflection from the path will cause a point loss.\n6.Colliding with leader robot will reduce the point.\n7.At most 2 chances will be given in one round.",
							  "1.Max no. of participants per team should be 4, though a singular participation is also appreciated.\n2.Every team must have some team name and registration number that will be issued by us.\n3.Students of different educational institutes can take part together.",
							  "1.The robot will be penalized if any member of the team touches it after the task is started.\n2.The robot should not leave the chase at any point of time during the task or else it will be penalized.\n3.Any robot not conforming to the given specifications will be instantly disqualified.\n4.Any robot that damages the arena will be disqualified.\n5.Any team not present at the allotted time will be disqualified by default.",
							  "300 per team",
							  "SUNNY YADAV, SHIVA AGRAWAL","9650379367 ,8130611697"
							  },
							  {"•Aim:\nMake a black line following robot. The time taken by the bot to traverse through the course will be one of the concrete criteria for determining the winner. The lesser the time taken the better the points gained by the bot. If nobody finish the run, the farthest one run on tracks with maximum points will win.\n\n•Bot Specifications:\nMaximum size of a robot : 25*25*25 cm.\nMaximum weight : 3 kg (Note: Dimensional and weight limits for robots shall be strictly enforced. Robots will have to pass inspection prior to competing. The robot has to be completely autonomous. Once a robot has crossed the starting line it must remain fully autonomous, or it will be disqualified.\n•Course Specifications:\nThe line shall be black, 30 mm wide.\n\nThere shall be a starting area at the beginning of the course and an exit area at the end. The line course starts inside the starting area and ends inside the exit area. The start and end points of the line course shall be clearly marked via a transverse line.\nSharp angles may occur and the tracks may also be composed of some curves and broken lines, hurdles, obstacle (motile or non-motile both).\n",
								  "•A team can have 2 – 3 members, out of which maximum of 1 can be allowed in the arena.\n•The event will be conducted in two level, and top 5 teams in the leader board will be eligible for the final round.\n•Once a robot has crossed the starting line it must remain fully autonomous, or it will be disqualified.\n•Any robot that loses the line course must reacquire the line at the previous Checkpoint where it was lost, or at any earlier (e.g. already traversed Checkpoint).\n•Bot must not lose any parts in the arena or collide with any other bot during the competitions, this will lead to disqualification.\n\n••Battery and Power: The robot can be powered electrically only. The electric voltage between 2 points anywhere in the robot should not be more than 12 V DC at any point of time. All efforts must be made to protect battery terminals from a direct short and causing a battery fire, failure to do so will cause direct disqualification.",
								  "Rs 300 per team",
								  "Prateek, Dhananjay "," 8004422481,8447186770 "
								  },
								  {"Does your robot have ability to rule the world? It’s the time to prove it…\nPresenting, an incinerating zone of terror for robots, Real steel– The Robo War.\nA scintillating war of Robots. So be ready to fight, conquer, defeat and rule a kingdom full of threats.\nHere you will have to eliminate the other team by fighting with a warrior robot.\n",
									  "•Robot Size\nAt starting position, Robot must fit into a box of size 60cm X 60cm X 60cm and maximum permitted weight of bot is 60kgs.\n•Power Specification\nThe maximum D.C. voltage supply at any time must not exceed 24V onboard.\nAn external 220V AC will be provided.\n•Note : Any team using any different form of energy must make the necessary arrangement on their own. They must confirm it with organizers beforehand for safety reasons.\n•Weapon Specification\nEach Robot must possess at least one attacking weapon.\nBefore the beginning of any round the robots will be tested for safety and maximum size and weight criterion.\n",
									  "•A team can consist of a maximum 6 participants. Each participant must have a valid college identity card. The round finishes at the end of 3 minutes or when one team knocks out the opposing team, whichever occurs first.\n•In each case the Robot must start from given starting dimension. The timer would be stopped for rearranging positions.\n•Use of any mechanism that damages the arena would lead to disqualification.\n•Dragging the wired Robot once it is placed on the track may lead to disqualification.\n•Fire, water, chemicals are not to be used as weapons.\n•Lego kits/parts are not allowed.\n•There may be simple amendments to the rules which will be announced before starting the game.\n•The decisions of judges will be final and binding.\n•Judges and organizers reserve the right to modify the rules. Participants are required to check for the updates.",
									  "There will be a ROUND ROBIN type tournament. Every team will battle every other team in the tournament. In the end, two teams with maximum points will be selected to play final. The final battle will decide the winner.\n\n\n•Game\n\nThe event will be played in three rounds of 3 minutes each.\nIn each round, both teams battle their bots in the arena. The team who wins the max rounds is declared as the winner\n\n•POINTS:\n10 points for winning a round\n\n5 point for a draw\n\n0 point for losing a round\n\n1 point for a significant hit with weapon.\n\nNOTE: Only significant hit will be considered for a point. It is decided by the judges .\nA team wins if  : \nIt knocks out the opponent out of the arena.\nElse if the other team is made non operational for 20 seconds\nElse if it has more points than other team at the end of round after 3 minutes.\nIt fulfills the given round qualifying conditions :\nElse the team with best design wins which will be decided by judges on the basis of innovative weapon, better strategy, good mobility and efficient controls.",
									  "Rs 500 PER TEAM",
									  "ABHAY,ANKUR,CHHAYANK","+919990396887,99548044440, +919871671660"},
								  {
									  "Each team have to build a manual robot capable for racing.",
									  "•It will be a time trial.\n•There will be two rounds – Prelims and Finals\n•The bot will have to begin from the starting point and make its way towards the finish line overcoming all the obstacles on its way\n•The maximum allowed time will be told at the time of event.\n•The team can skip an obstacle but with an addition of time penalty of 15 seconds in the total time taken.",
									  "•Points awarded for different checkpoints can be different for different obstacle depending upon the level of toughness of the obstacle)\n•Restarting at an obstacle or skipping it is permitted and is always an option.\n•-50 for each restart\n•+100 for crossing the obstacle.\n•-120 for skipping\n•+300 for completing the whole arena.\n•We can give time option means for completing the arena in a particular time interval we can award points on that.",
									  "•The team will be provided with a 220V,50Hz supply.\n•The bot can be run on both power sources A.C.(Provided by the organizers) or D.C.(The participating team will have to arrange for it)\n•The dimensions of the bot should not be greater than 30*25*25 cm.\n•The bots can be powered both on board or off board.\n•The bot should be water resistant enough to not face a problem while crossing muddy spots.\n•Ready-made chassis are strictly not allowed, the chassis should be handmade (Co ordinators will be strict in this aspect).",
									  " 300 per team",
									  		"SYED GHULAM ASKARI"," +919891084587"
											  }
				  }
				};		public static final String ARG_SECTION_NUMBER = "section_number";

		public DummySectionFragment() {
		}
		
		View rootView;
		int divs,m1,m2,count;
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			
			divs=Integer.parseInt(getArguments().getString("POSS"));
			m1=getArguments().getInt("m1");
			m2=getArguments().getInt("m2");
			count=getArguments().getInt("count");
			
		   //	divs=Integer.parseInt(getArguments().getString("POSS"));
		   	rootView = inflater.inflate(R.layout.listview,
					container, false);
		list=(ListView)rootView.findViewById(R.id.listView1);
		//	TextView dummyTextView = (TextView) rootView
			//		.findViewById(R.id.section_label);
			//dummyTextView.setText(username);
		  //new MyTask().execute();
	 // mProgressDialog.dismiss();
	 //String mon_nme[];
		//String mon_nme1[];
		//String mon_nme2[];
	 	String mon_nme[];
		String mon_nme1[]=funcsep(problemstatement[m1][m2][divs]);
		String mon_nme2[]=funcsep(problemstatement[m1][m2][divs+1]);

	 /*if(divs==0)
	 {
		  	/*rootView = inflater.inflate(R.layout.imagelayout5_1,
					container, false);
		  	ImageView imageview1=(ImageView)rootView.findViewById(R.id.imageView1);
		  	 imageview1.setImageResource(R.drawable.meta22);
		  	 TextView tcv=(TextView)rootView.findViewById(R.id.textView1);
		  	 tcv.setText(problemstatement[m1][m2][0]);
		  	*////
		 String s1[]={""+problemstatement[m1][m2][0]};
		 Integer si2[]={R.drawable.meta22};
		imagecustom5 ic5=new imagecustom5(getActivity(), s1,si2);
			list.setAdapter(ic5);
			//
			
		 
//	 }*/
	 if(divs==count-1)
	 {
		 imagecustom7 ic7=new imagecustom7(getActivity(), mon_nme1, mon_nme2);
	    	list.setBackgroundColor(Color.BLACK);
			list.setAdapter(ic7);
			

	 }
	 else{
		 rootView = inflater.inflate(R.layout.imagelayout6,
					container, false);
		  	 //ImageView imageview1=(ImageView)rootView.findViewById(R.id.listImage);
		  	 //imageview1.setImageResource(R.drawable.meta22);
		  	 TextView tcv=(TextView)rootView.findViewById(R.id.textView1);
		  	 tcv.setText(problemstatement[m1][m2][divs]);
		  	
		 } 
			return rootView;
		///	SQLiteDatabase db=openOrCreateDatabase("MYDataBase", 0, null);
			
		}
		public String[] funcsep(String spr)
		{	String[] temp;
		String delimiter = ",";
		  /* given string will be split by the argument delimiter provided. */
		  temp = spr.split(delimiter);
			return temp;
			
		}
		}
	
}
