import java.util.Scanner;

public class VillageRevenge {
	public static void main(String[] args) {
		System.out.println("Choose your character");
		Scanner sc = new Scanner(System.in);
		System.out.println("- Character 1 -");
		System.out.println("Melee");
		System.out.println("Hp : 130 , Mana : 40 , AD : 15");
		System.out.println("This class can hit double damage with using 10 mana.");
		System.out.println(" ");
		System.out.println("- Character 2 -");
		System.out.println("Ranged Archer");
		System.out.println("Hp : 90 , Mana : 0 , AD : 20");
		System.out.println("This class heals himself everytime he attacks for his opponents ad/4");
		System.out.println(" ");
		System.out.println("Type 1 or 2 based on your character preferance");
		int charsel;
		float mhp = 130;
		int mm = 40;
		float ahp = 90;
		// charsel is shot for character selection
		while (true) {
			charsel = sc.nextInt();
			if (charsel == 1) {
				System.out.println("Character 1 chosen.");
				// mhp is for melee healt point
				//mm is for melee mana
				break;
			}
				else if (charsel == 2) {
					System.out.println("Character 2 chosen.");
					// ahp is for archer healt point
					break;
				}
				else if (charsel != 1 && charsel != 2) {
					System.out.println("Please type 1 or 2");
				}
		}
		System.out.println("Story begins...");
		System.out.println(" ");
		System.out.println("You were born in a small village");
		System.out.println("There was peace. The town people was kind and helpful.");
		System.out.println("As you were slowly growing up, you liked the place.");
		System.out.println("The night you turned 14 something horrible happened");
		System.out.println("You heard some screaming from outside. This was unusual.");
		System.out.println("You looked throught the window to see the outside");
		System.out.println("There were some green giants destroying and burning everything and everyone you loved.");
		System.out.println("You were filled with anger but you saw the soldiers fighting with them");
		System.out.println("It was not looking good. Giants took down the most experienced soldiers easily.");
		System.out.println("You were scared and you ran.");
		System.out.println(" ");
		System.out.println("Time passed...");
		System.out.println(" ");
		System.out.println("Now you are 21, you learned fighting.");
		System.out.println("You are ready to take revenge.");
		System.out.println("You feel like 'Vengeance'...");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Do you want to get revenge? '1 for yes 0 for no '");
		while (true) {
			int venge = sc.nextInt();
			if (venge == 1) {
				System.out.println("Adventure begins");
				break;
			}
				else if (venge == 0) {
					System.out.println("You lost try again");
					System.exit(0);
				}
				else {
					System.out.println("Type 1 if you want to start adventure and type 0 if you want to exit");
				}
		}
		System.out.println("On your way there was a ogre 'green giant'.");
		int orgehp = 60 ;
		float orgead = 10 ;
	if (charsel == 1) {
			System.out.println("You pulled out your sword and challanged the orge");
			System.out.println("Orges have 60 Hp and 10 AD");
			while (true) {
				System.out.println("Your Healt Point is " + mhp);
				System.out.println("Your Mana is " + mm);
				System.out.println("Your opponents Healt Point is " + orgehp);
				System.out.println(" ");
				if (mhp <= 0) {
					System.out.println("You died. Try again.");
					System.exit(0);
				}
				
				System.out.println("Ogre was confused so you will attack.");
				System.out.println("If you want to hit double amount of your ad type '1'[Typing anything else will be ignored] This will use your mana. If you dont have mana you wont be able to use this.");
				int manaattack = sc.nextInt();
				if (manaattack == 1 && mm >= 0) {
					mm = mm - 10;
					orgehp = orgehp - 30;
				}
					else {
						orgehp = orgehp - 15;
					}
				System.out.println("Your Healt Point is " + mhp);
				System.out.println("Your Mana is " + mm);
				System.out.println("Your opponents Healt Point is " + orgehp);
				System.out.println(" ");
				if (orgehp <= 0) {
					System.out.println("You won. Congrats");
					break;
				}
				System.out.println("Now he is mad. He's gonna hit you.");
				mhp = mhp - orgead;
			}
		}
			else if (charsel == 2) {
				System.out.println("You got your bow and arrows out.");
				System.out.println("Orges have 60 Hp and 10 AD");
				System.out.println("You will steal his life for every hit you do.");
				System.out.println(" *******");
				System.out.println("Type any integar when you can if you want to continue");
				System.out.println(" *******");
				while (true) {
					if (ahp <= 0) {
						System.out.println("You died. Try again.");
						System.exit(0);
					}
					System.out.println("Your Healt Point is " + ahp);
					System.out.println("Your opponents Healt Point is " + orgehp);
					System.out.println(" ");
					int con1 = sc.nextInt();
					System.out.println("Ogre was confused so you will attack.");
					orgehp = orgehp - 20;
					ahp = ahp + (orgead / 4);
					System.out.println("Your Healt Point is " + ahp);
					System.out.println("Your opponents Healt Point is " + orgehp);
					System.out.println(" ");
					if (orgehp <= 0) {
						System.out.println("You won. Congrats");
						break;
					}
					int con2 = sc.nextInt();
					System.out.println("Orge will attack you");
					ahp = ahp - orgead;
					
				
				}
			}
		
		
		
	}
}