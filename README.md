HEALTH AND FITNESS APP (HFA) V0.1

--- for demo1 ---
to run the program, run 'make' in the command line, then 'make test' to execute the demo1

if make is not installed, run
'javac StrengthStandard.java';
'java StrengthStandard';
--- end note ---

The intention of this application is to give users valuable insights and data
regarding their health and fitness. 

CURRENT FEATURES:

HFA will accept the following data about user:

- Gender
- Height 
- Weight
- Body Fat%
- Activity Level
- Resting BPM
- Lifting data

Based on the above inputs, HFA will present the following stats:

Body Mass Index - BMI is a general calculation used to assess a person's general level of weight normalcy.
This metric is most relevant for people who do not lift weights or exercise a lot, and is a good standard
for most people to assess whether an individual is underweight, overweight, or at a reccomended level.

The BMI formula is BMI = Kg / m^2. Here are the standard BMI ranges.

Weight Category 	
BMI
Underweight	
Below 18.5
Normal	
18.524.9
Overweight	
25.029.9
Obesity	
30.0 and Above

Fat Free Mass Index - Similar to BMI, FFMI takes muscle mass into account. Those with a high amount of 
lean muscle mass, such as bodybuilders, would find themselves very overweight in a BMI calculation. The
FFMI takes body fat into account. This metric is also used to assess whether competitors are synthetically
enhanced, as scores above 25 are nearly impossible to achieve naturally. 

FFMI calculation: 

Total Body Fat = Weight in Kg * (body fat % / 100)
Lean Weight = Weight in Kg * (1 - (body fat % / 100)
FFMI = (Lean Weight in Kg / 2.2)/ ((Feet * 12.0 + Inches) * 0.0254)^2
Adjusted FFMI = FFMI + ( 6.3 * (1.8 - (Feet * 12.0 + Inches) * 0.0254))

VO2 max - This is a measure of the volume of oxygen that is used by your body to convert energy. The
metric is the maximum rate that an individual can achieve. This is often calculated for atheletes who
do very intense cardio such as runners and cyclists. Although it is usually tested in a sophisticated
lab, there are fairly accurate calculations that can be performed based on resting BPM and Age. 

Standards: 

A+      "Superior"
A      "Excellent"
B      "Good"
C      "Fair"
D      "Poor"

Age	D	C	B	A	A+
20 - 29	<= 41	42 - 45	46 - 50	51 - 55	56+
30 - 39	<= 40	41 - 43	44 - 47	48 - 53	54+
40 - 49	<= 37	38 - 41	42 - 45	46 - 52	53+
50 - 59	<= 34	35 - 37	38 - 42	43 - 49	50+
60 - 69	<= 30	31 - 34	35 - 38	39 - 45	46+
70 - 79	<= 27	28 - 30	31 - 35	36 - 41	42+

Strength Standards - Currently HFA can give you insights based on your 1-rep max bench press. Your
lift will be compared against data from millions of other lifters, and a percentile will be calculated
to give you an idea of where you stand amongst others of similar gender, weight, etc. 





sources:

http://www.shapesense.com/fitness-exercise/articles/vo2-and-vo2max.shtml#what-are-normal-vo2max-values
https://www.calculators.org/health/ffmi.php
https://www.calculators.org/health/bmi.php
