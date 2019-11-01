import java.util.Scanner;

public class StrengthStandard {
	
	private String gender;
	private int age;
	private int bodyweight_lbs;
	private int heightFoot;
	private int heightInch;

	private int bprStandard;

	public void createProfile() { // POSSIBLY OBSOLETE(?)
		Scanner settings = new Scanner(System.in);

		System.out.print("\n==============================\n *** CREATE YOUR PROFILE ***\n==============================\n\n");
		System.out.print("Please enter your sex (M/F): ");
		this.gender = settings.nextLine();

		System.out.print("Please enter your age: ");
		this.age = settings.nextInt();

		System.out.print("Please enter your height ROUNDED DOWN to the NEAREST FOOT: ");
		this.heightFoot = settings.nextInt();
		System.out.print("Enter the remaining inches (0-11): ");
		this.heightInch = settings.nextInt();

		System.out.print("Please enter your bodyweight (lbs.): ");
		this.bodyweight_lbs = settings.nextInt();

	}




	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public int getBodyweight() {
		return bodyweight_lbs;
	}

	public void chooseExercise() {
		int exercise = -1;
		String exit;

		Scanner choice = new Scanner(System.in);
		Scanner returnExit = new Scanner(System.in); // RETURN TO CHOOSEEXERCISE() AFTER MAKING CHOICE

		while (exercise != 0) {

			System.out.print("\n==============================\n *** EXERCISES ***\n==============================\n\n   (1) Bench Press\n   (2) Squat [WIP]\n   (3) Deadlift [WIP]\n   (4) Shoulder Press [WIP]\n   (5) Barbell Curl [WIP]\n\n   (0) [BACK TO SUBMENU]\n\nPlease choose an exercise: ");
			exercise = choice.nextInt();

			switch(exercise) {

				case 0: // [EXIT MENU]
					break;

				case 1:
					benchPress();

					System.out.print("\nWould you like to return to the EXERCISES menu? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N")) {
						exercise = 0;
						break;
					} else {
						break;
					}

				case 2:
					//squat();
					break;
				case 3:
					//deadLift();
					break;
				case 4:
					//shoulderPress();
					break;
				case 5:
					//barbellCurl();
					break;
			}
		}
	}

	public void benchPress() {
		Scanner settings = new Scanner(System.in);

		System.out.print("\nEnter your one-rep max lift (lbs.): ");
		bprStandard = settings.nextInt();

		if (gender.equals("M") || gender.equals("m")) {
			maleBPRStandard();
		} else if (gender.equals("F") || gender.equals("f")) {
			femaleBPRStandard();
		}
	}

	public double calculateBMI() {
		double weightKG = (bodyweight_lbs * 0.453592);
		double heightMetres = ((heightFoot * 0.3048) + (heightInch * 0.0254));

		return Math.round((weightKG / Math.pow(heightMetres, 2)) * 10.0) / 10.0;
	}

/*
	public double calculateBMI(int heightFoot, int heightInch, double weightLBS) {
		double weightKG = (weightLBS * 0.453592);
		double heightMetres = ((heightFoot * 0.3048) + (heightInch * 0.0254));

		return Math.round((weightKG / Math.pow(heightMetres, 2)) * 10.0) / 10.0;
	}
*/

	public double calculateVO2Max() {
		return 0.0;
	}

	public double calculateFFMI(double bfpercent) {
		double weightKG = (bodyweight_lbs * 0.453592);
		double leanWeightKG = (weightKG - (weightKG * (bfpercent/100)));

		double upperValue = (leanWeightKG/2.2);
		double lowerValue = Math.pow(((heightFoot * 12.0 + heightInch) * 0.0254), 2);

		return Math.round(((upperValue/lowerValue) * 2.20462) * 10.0) / 10.0;
	}

/*
	public double calculateFFMI(int heightFoot, int heightInch, double bfpercent, double weightLBS) {
		double weightKG = (weightLBS * 0.453592);
		double leanWeightKG = (weightKG - (weightKG * (bfpercent/100)));

		double upperValue = (leanWeightKG/2.2);
		double lowerValue = Math.pow(((heightFoot * 12.0 + heightInch) * 0.0254), 2);

		return Math.round(((upperValue/lowerValue) * 2.20462) * 10.0) / 10.0;
	}
*/

	public void changeSettings() {	
		int choice = -1;
		String exit;
		Scanner change = new Scanner(System.in);
		Scanner change2 = new Scanner(System.in);
		Scanner returnExit = new Scanner(System.in);

		while (choice != 0) {

			System.out.print("\n==============================\n");
			System.out.println("\nCURRENT SETTINGS:");
			System.out.println(" | Sex: " + gender);
			System.out.println(" | Age: " + age);
			System.out.println(" | Height: " + heightFoot + "'" + heightInch + "\"");
			System.out.println(" | Bodyweight: " + bodyweight_lbs + " lbs.");

			System.out.print("\n==============================\n *** SETTINGS ***\n==============================\n\n   (1) Sex\n   (2) Age\n   (3) Height\n   (4) Bodyweight\n\n   (0) [BACK TO SUBMENU]\n\nChoose a setting: ");
			choice = change.nextInt();

			switch(choice) {

				case 0: // [BACK TO SUBMENU]
					break;

				case 1: // SEX
					System.out.print("\nPlease enter your sex (M/F): ");
					this.gender = change2.nextLine();
					break;

				case 2: // AGE
					System.out.print("\nPlease enter your age: ");
					this.age = change.nextInt();
					break;

				case 3: // HEIGHT
					System.out.print("\nPlease enter your height ROUNDED DOWN to the NEAREST FOOT: ");
					this.heightFoot = change.nextInt();
					System.out.print("Enter the remaining inches (0-11): ");
					this.heightInch = change.nextInt();
					break;

				case 4: // BODYWEIGHT
					System.out.print("\nPlease enter your bodyweight (lbs.): ");
					this.bodyweight_lbs = change.nextInt();
					break;
			}

		}

	}


	public int subMenu() {
		int choice = -1;
		String exit;
		Scanner newScanner = new Scanner(System.in); // EXIT SUBMENU()
		Scanner returnExit = new Scanner(System.in); // RETURN TO SUBMENU() AFTER MAKING CHOICE

		while (choice != 0) {

			System.out.print("\n==============================\n *** SUBMENU ***\n==============================\n\n   (1) Body Mass Index (BMI)\n   (2) VO2 Max [WIP]\n   (3) Fat Free Mass Index (FFMI)\n   (4) Exercises - Strength Standards\n\n   (5) [INFO]\n\n   (6) [SETTINGS]\n\n   (0) [EXIT SUBMENU]\n\nSelect from the above options: ");
			choice = newScanner.nextInt();

			switch(choice) {

				case 0: // [EXIT SUBMENU]
					break;

				case 1: // BMI
					choice = -1;
/*
					int bmiHeightFoot;
					int bmiHeightInch;
					double bmiWeightLBS;

					System.out.print("\nPlease enter your height ROUNDED DOWN to the CLOSEST FOOT: ");
					bmiHeightFoot = bmiScan.nextInt();
					System.out.print("Enter the remaining inches (0-11): ");
					bmiHeightInch = bmiScan.nextInt();

					System.out.print("Please enter your weight (lbs.): ");
					bmiWeightLBS = bmiScan.nextDouble();
*/
					System.out.print("\n**Your BMI is: " + calculateBMI());
					System.out.print("\n\nBMI Categories:\n Underweight = below 18.5\n Normal = 18.5-24.9\n Overweight = 25.0-29.9\n Obese = 30.0 or greater");

					System.out.print("\n\nWould you like to return to the SUBMENU? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N")) {
						choice = 0;
						break;
					} else {
						break;
					}

				case 2: // VO2 MAX [UNFINISHED]
					choice = -1;

					System.out.print("\nWould you like to return to the SUBMENU? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N")) {
						choice = 0;
						break;
					} else {
						break;
					}

				case 3: // FFMI
					choice = -1;
					Scanner ffmiScan = new Scanner(System.in);

					double ffmiBF;

					System.out.print("\nPlease enter your Body Fat (%): ");
					ffmiBF = ffmiScan.nextDouble();

					System.out.print("\n**Your FFMI is: " + calculateFFMI(ffmiBF));

					System.out.print("\n\nWould you like to return to the SUBMENU? (Y/N) ");
					exit = returnExit.nextLine();
					if (exit.equals("N")) {
						choice = 0;
						break;
					} else {
						break;
					}		

				case 4: // CHOOSE EXERCISE
					chooseExercise();
					break;



				case 5: // [INFO]

					System.out.print("\n==============================\n");

					System.out.println("\nBody Mass Index (BMI):");
					System.out.println(" | A key index for relating weight to height. Body Mass Index, or BMI, is a person's weight in kilograms (kg)");
					System.out.println(" | divided by his or her height in metres squared. The result of a BMI measurement can give an idea about whether");
					System.out.println(" | a person has a healthy weight for their height.");

					System.out.println("\nVO2 Max:");
					System.out.println(" | VO2 Max, also known as Maximal Oxygen Consumption, refers to the maximum amount of oxygen you can utilize during");
					System.out.println(" | exercise of increasing intensity (incremental exercise). VO2 Max is measured in millilitres of oxygen consumed");
					System.out.println(" | consumed in one minute, per kilogram of body weight (mL/kg/min).");

					System.out.println("\nFat Free Mass Index (FFMI):");
					System.out.println(" | Fat Free Mass Index, or FFMI, is an alternative to Body Mass Index (BMI) which accounts for a person's muscle mass.");
					System.out.println(" | Rather than measuring the total mass of your body, FFMI only considers the lean (or fat-free) mass.");

					break;

				case 6: // [SETTINGS]
					changeSettings();
					break;

				default:
					System.out.print("Please make a selection (0-3): ");
					break;
			}
		}
		return -1;
	}













	public void maleBPRStandard() {

		int temp_bodyweight = this.bodyweight_lbs;
		temp_bodyweight = Math.round(temp_bodyweight/10) * 10;

		switch(temp_bodyweight) {

			case 110:
				if (bprStandard < 53) {
					System.out.println("\n**You are stronger than 0% of lifters.");					
				} else if (bprStandard >= 53 && bprStandard < 84) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 84 && bprStandard < 125) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 125 && bprStandard < 173) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 173 && bprStandard < 227) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 227) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 120:
				if (bprStandard < 63) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 63 && bprStandard < 97) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 97 && bprStandard < 140) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 140 && bprStandard < 191) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 191 && bprStandard < 247) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 247) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 130:
				if (bprStandard < 73) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 73 && bprStandard < 109) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 109 && bprStandard < 154) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 154 && bprStandard < 208) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 208 && bprStandard < 266) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 266) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 140:
				if (bprStandard < 83) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 83 && bprStandard < 121) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 121 && bprStandard < 168) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 168 && bprStandard < 224) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 224 && bprStandard < 285) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 285) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 150:
				if (bprStandard < 92) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 92 && bprStandard < 132) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 132 && bprStandard < 182) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 182 && bprStandard < 240) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 240 && bprStandard < 302) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 302) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 160:
				if (bprStandard < 102) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 102 && bprStandard < 144) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 144 && bprStandard < 195) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 195 && bprStandard < 255) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 255 && bprStandard < 319) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 319) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 170:
				if (bprStandard < 111) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 111 && bprStandard < 155) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 155 && bprStandard < 208) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 208 && bprStandard < 270) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 270 && bprStandard < 336) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 336) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 180:
				if (bprStandard < 120) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 120 && bprStandard < 166) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 166 && bprStandard < 221) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 221 && bprStandard < 284) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 284 && bprStandard < 352) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 352) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 190:
				if (bprStandard < 129) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 129 && bprStandard < 176) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 176 && bprStandard < 233) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 233 && bprStandard < 298) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 298 && bprStandard < 367) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 367) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 200:
				if (bprStandard < 138) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 138 && bprStandard < 187) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 187 && bprStandard < 245) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 245 && bprStandard < 311) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 311 && bprStandard < 382) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 382) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 210:
				if (bprStandard < 147) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 147 && bprStandard < 197) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 197 && bprStandard < 257) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 257 && bprStandard < 324) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 324 && bprStandard < 396) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 396) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 220:
				if (bprStandard < 156) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 156 && bprStandard < 207) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 207 && bprStandard < 268) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 268 && bprStandard < 337) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 337 && bprStandard < 410) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 410) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 230:
				if (bprStandard < 164) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 164 && bprStandard < 216) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 216 && bprStandard < 279) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 279 && bprStandard < 349) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 349 && bprStandard < 424) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 424) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 240:
				if (bprStandard < 172) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 172 && bprStandard < 226) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 226 && bprStandard < 290) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 290 && bprStandard < 361) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 361 && bprStandard < 437) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 437) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 250:
				if (bprStandard < 181) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 181 && bprStandard < 235) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 235 && bprStandard < 300) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 300 && bprStandard < 373) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 373 && bprStandard < 450) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 450) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 260:
				if (bprStandard < 189) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 189 && bprStandard < 244) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 244 && bprStandard < 311) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 311 && bprStandard < 385) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 385 && bprStandard < 463) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 463) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 270:
				if (bprStandard < 196) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 196 && bprStandard < 253) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 253 && bprStandard < 321) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 321 && bprStandard < 396) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 396 && bprStandard < 475) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 475) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 280:
				if (bprStandard < 204) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 204 && bprStandard < 262) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 262 && bprStandard < 330) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 330 && bprStandard < 407) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 407 && bprStandard < 487) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 487) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 290:
				if (bprStandard < 212) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 212 && bprStandard < 271) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 271 && bprStandard < 340) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 340 && bprStandard < 417) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 417 && bprStandard < 499) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 499) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 300:
				if (bprStandard < 219) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 219 && bprStandard < 279) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 279 && bprStandard < 349) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 349 && bprStandard < 428) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 428 && bprStandard < 510) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 510) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 310:
				if (bprStandard < 227) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 227 && bprStandard < 287) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 287 && bprStandard < 359) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 359 && bprStandard < 438) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 438 && bprStandard < 521) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 521) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;
		}
	}







	public void femaleBPRStandard() {
		switch(bodyweight_lbs) {

			case 90:
				if (bprStandard < 19) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 19 && bprStandard < 41) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 41 && bprStandard < 72) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 72 && bprStandard < 111) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 111 && bprStandard < 157) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 157) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 100:
				if (bprStandard < 23) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 23 && bprStandard < 47) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 47 && bprStandard < 79) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 79 && bprStandard < 121) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 121 && bprStandard < 169) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 169) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 110:
				if (bprStandard < 27) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 27 && bprStandard < 52) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 52 && bprStandard < 87) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 87 && bprStandard < 130) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 130 && bprStandard < 179) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 179) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 120:
				if (bprStandard < 31) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 31 && bprStandard < 58) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 58 && bprStandard < 94) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 94 && bprStandard < 139) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 139 && bprStandard < 189) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 189) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 130:
				if (bprStandard < 35) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 35 && bprStandard < 63) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 63 && bprStandard < 101) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 101 && bprStandard < 147) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 147 && bprStandard < 199) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 199) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 140:
				if (bprStandard < 39) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 39 && bprStandard < 68) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 68 && bprStandard < 107) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 107 && bprStandard < 154) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 154 && bprStandard < 208) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 208) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 150:
				if (bprStandard < 43) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 43 && bprStandard < 73) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 73 && bprStandard < 113) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 113 && bprStandard < 162) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 162 && bprStandard < 216) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 216) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 160:
				if (bprStandard < 47) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 47 && bprStandard < 78) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 78 && bprStandard < 119) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 119 && bprStandard < 169) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 169 && bprStandard < 225) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 225) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 170:
				if (bprStandard < 50) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 50 && bprStandard < 82) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 82 && bprStandard < 125) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 125 && bprStandard < 176) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 176 && bprStandard < 232) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 232) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 180:
				if (bprStandard < 54) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 54 && bprStandard < 87) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 87 && bprStandard < 130) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 130 && bprStandard < 182) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 182 && bprStandard < 240) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 240) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 190:
				if (bprStandard < 57) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 57 && bprStandard < 91) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 91 && bprStandard < 136) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 136 && bprStandard < 188) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 188 && bprStandard < 247) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 247) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 200:
				if (bprStandard < 61) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 61 && bprStandard < 96) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 96 && bprStandard < 141) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 141 && bprStandard < 194) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 194 && bprStandard < 254) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 254) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 210:
				if (bprStandard < 64) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 64 && bprStandard < 100) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 100 && bprStandard < 146) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 146 && bprStandard < 200) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 200 && bprStandard < 261) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 261) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 220:
				if (bprStandard < 67) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 67 && bprStandard < 104) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 104 && bprStandard < 150) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 150 && bprStandard < 206) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 206 && bprStandard < 267) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 267) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 230:
				if (bprStandard < 70) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 70 && bprStandard < 107) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 107 && bprStandard < 155) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 155 && bprStandard < 211) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 211 && bprStandard < 273) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 273) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 240:
				if (bprStandard < 73) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 73 && bprStandard < 111) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 111 && bprStandard < 160) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 160 && bprStandard < 217) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 217 && bprStandard < 279) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 279) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 250:
				if (bprStandard < 76) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 76 && bprStandard < 115) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 115 && bprStandard < 164) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 164 && bprStandard < 222) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 222 && bprStandard < 285) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 285) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;

			case 260:
				if (bprStandard < 79) {
					System.out.println("\n**You are stronger than 0% of lifters.");
				} else if (bprStandard >= 79 && bprStandard < 119) {
					System.out.println("\n**You are stronger than 5% of lifters (BEGINNER).");
				} else if (bprStandard >= 119 && bprStandard < 168) {
					System.out.println("\n**You are stronger than 20% of lifters (NOVICE).");
				} else if (bprStandard >= 168 && bprStandard < 227) {
					System.out.println("\n**You are stronger than 50% of lifters (INTERMEDIATE).");
				} else if (bprStandard >= 227 && bprStandard < 291) {
					System.out.println("\n**You are stronger than 80% of lifters (ADVANCED).");
				} else if (bprStandard > 291) {
					System.out.println("\n**You are stronger than 95% of lifters (ELITE).");
				}
				break;
		}
	}
/*
==================================================================
==================================================================
*/
	public static void main(String[] args) {
		StrengthStandard s1 = new StrengthStandard();
		s1.createProfile();
		s1.subMenu();
	}
}
/*
Exercise:
	(1) Bench Press
	(2) Squat
	(3) Deadlift
	(4) Shoulder Press
	(5) Barbell Curl




INPUTS:
	- BMI


GETTER:
	- Age
	- Bodyweight
	- Gender
	- 

	exit = return -1;


*/
