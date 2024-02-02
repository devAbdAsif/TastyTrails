package com.example.tastytrails;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class proceduredishes extends AppCompatActivity {
    RecyclerView recyclerview;
    Adapterdish adapterdish;
    ArrayList<ModelDish> lists;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakistanifoods);
        recyclerview=findViewById(R.id.crecview);
        String name=getIntent().getStringExtra("foodname");
        if (name.equals("Pakistani Foods")){
            lists=new ArrayList<>();
            lists.add(new ModelDish(R.drawable.biryani,"Biryani","Ingredients:\n" +
                    "\n" +
                    "1 kg chicken, cut into pieces\n" +
                    "2 cups basmati rice, soaked for 30 minutes and drained\n" +
                    "2 large onions, thinly sliced\n" +
                    "1/2 cup plain yogurt\n" +
                    "4 tomatoes, chopped\n" +
                    "2 tablespoons biryani masala\n" +
                    "1 tablespoon ginger-garlic paste\n" +
                    "1/2 cup fresh coriander leaves, chopped\n" +
                    "1/2 cup fresh mint leaves, chopped\n" +
                    "4 cups water\n" +
                    "1/4 cup ghee or vegetable oil\n" +
                    "Whole spices: 4-5 cloves, 4-5 green cardamom pods, 1-inch cinnamon stick, 1 bay leaf\n" +
                    "Saffron strands soaked in 2 tablespoons of warm milk (optional)\n" +
                    "Salt to taste\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a large pot, heat ghee or oil over medium heat and add the whole spices. Fry until fragrant.\n" +
                    "Add sliced onions and sauté until golden brown. Remove half of the fried onions and set them aside.\n" +
                    "Add ginger-garlic paste to the pot and cook for a minute until the raw smell disappears.\n" +
                    "Add chopped tomatoes, biryani masala, and salt. Cook until the tomatoes are soft and the oil separates.\n" +
                    "Stir in the chicken pieces and cook until they are partially cooked and coated with the masala.\n" +
                    "In a separate pot, bring water to a boil and add the soaked and drained rice. Cook the rice until it is 70% done. Drain the water and set the rice aside.\n" +
                    "In a large pot, layer the partially cooked chicken with rice, and sprinkle chopped coriander and mint leaves between the layers. Also, add the saffron-soaked milk on the top layer if using.\n" +
                    "Cover the pot tightly with a lid and cook on low heat for about 30 minutes or until the chicken and rice are fully cooked and fragrant.\n" +
                    "Garnish with the reserved fried onions before serving."));
            lists.add(new ModelDish(R.drawable.kabab,"Kabab","Ingredients:\n" +
                    "\n" +
                    "500g ground beef or lamb\n" +
                    "1 medium onion, finely grated\n" +
                    "2 tablespoons ginger-garlic paste\n" +
                    "2 green chilies, finely chopped\n" +
                    "2 tablespoons chopped fresh coriander leaves\n" +
                    "1 teaspoon cumin powder\n" +
                    "1 teaspoon coriander powder\n" +
                    "1/2 teaspoon garam masala\n" +
                    "1/2 teaspoon red chili powder\n" +
                    "1/2 teaspoon black pepper powder\n" +
                    "1/2 teaspoon paprika or Kashmiri red chili powder (for color)\n" +
                    "1 tablespoon lemon juice\n" +
                    "Salt to taste\n" +
                    "Skewers for grilling\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a large mixing bowl, combine all the ingredients and mix thoroughly to form a uniform mixture.\n" +
                    "Take a handful of the mixture and mold it onto a skewer, shaping it into a long, cylindrical kebab.\n" +
                    "Repeat the process with the remaining mixture and skewers.\n" +
                    "Preheat the grill or barbecue and lightly grease it with oil.\n" +
                    "Grill the seekh kebabs until they are cooked through and evenly browned on all sides. You can also cook them on a stovetop grill or in the oven.\n" +
                    "Serve hot with naan bread, salad, and chutney."));
            lists.add(new ModelDish(R.drawable.aloogghosht,"Aloo Gosht","Ingredients:\n" +
                    "\n" +
                    "500g mutton or beef, cut into chunks\n" +
                    "3 large potatoes, peeled and quartered\n" +
                    "2 large onions, finely sliced\n" +
                    "3 tomatoes, chopped\n" +
                    "3 tablespoons vegetable oil\n" +
                    "1/2 cup plain yogurt\n" +
                    "2 tablespoons ginger-garlic paste\n" +
                    "1 teaspoon cumin seeds\n" +
                    "1 teaspoon coriander powder\n" +
                    "1/2 teaspoon turmeric powder\n" +
                    "1/2 teaspoon red chili powder\n" +
                    "1/2 teaspoon garam masala\n" +
                    "1/4 teaspoon ground black pepper\n" +
                    "Fresh coriander leaves for garnish\n" +
                    "Salt to taste\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a heavy-bottomed pot, heat the vegetable oil over medium heat and add the cumin seeds. Let them splutter.\n" +
                    "Add the finely sliced onions and sauté until they turn golden brown.\n" +
                    "Stir in the ginger-garlic paste and cook for a minute until the raw smell disappears.\n" +
                    "Add the chopped tomatoes, coriander powder, turmeric powder, red chili powder, garam masala, black pepper, and salt. Cook until the tomatoes are soft and the oil separates.\n" +
                    "Add the meat chunks and cook until they are partially done and coated with the masala.\n" +
                    "Stir in the plain yogurt and cook for a few more minutes.\n" +
                    "Add the quartered potatoes and enough water to cover the meat and potatoes. Bring it to a boil, then reduce the heat to low, cover, and simmer until the meat and potatoes are tender and fully cooked.\n" +
                    "Garnish with fresh coriander leaves and serve with steamed rice or naan."));
            lists.add(new ModelDish(R.drawable.chickenkarahi,"Chicken Karahi","Ingredients:\n" +
                    "\n" +
                    "1 kg chicken, cut into pieces\n" +
                    "3 medium tomatoes, chopped\n" +
                    "3-4 green chilies, slit\n" +
                    "1 large onion, thinly sliced\n" +
                    "1 tablespoon ginger-garlic paste\n" +
                    "1/2 cup plain yogurt\n" +
                    "1/4 cup vegetable oil\n" +
                    "1 teaspoon cumin seeds\n" +
                    "1 teaspoon red chili powder\n" +
                    "1/2 teaspoon turmeric powder\n" +
                    "1 teaspoon ground coriander\n" +
                    "1 teaspoon garam masala\n" +
                    "1 teaspoon dried fenugreek leaves (kasuri methi), crushed\n" +
                    "Fresh coriander leaves for garnish\n" +
                    "Salt to taste\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a large karahi or deep skillet, heat the vegetable oil over medium heat and add the cumin seeds. Let them splutter.\n" +
                    "Add the thinly sliced onion and sauté until they become translucent.\n" +
                    "Stir in the ginger-garlic paste and cook for a minute until the raw smell disappears.\n" +
                    "Add the chopped tomatoes, red chili powder, turmeric powder, ground coriander, and salt. Cook until the tomatoes are soft and the oil separates.\n" +
                    "Add the chicken pieces and cook until they are partially done and coated with the masala.\n" +
                    "Stir in the plain yogurt and continue to cook until the chicken is fully cooked and tender.\n" +
                    "Add the slit green chilies and crushed dried fenugreek leaves. Cook for a few more minutes.\n" +
                    "Sprinkle garam masala and garnish with fresh coriander leaves before serving."));
            recyclerview.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
            adapterdish=new Adapterdish(lists,getApplicationContext());
            recyclerview.setAdapter(adapterdish);

        }else if(name.equals("Italian Foods")){
            lists=new ArrayList<>();
            lists.add(new ModelDish(R.drawable.spaghetticarbonara,"Spaghetti Carbonara","Ingredients:\n" +
                    "\n" +
                    "400g spaghetti\n" +
                    "150g pancetta or guanciale (cured pork jowl), diced\n" +
                    "4 large eggs\n" +
                    "1 cup grated Pecorino Romano cheese\n" +
                    "Freshly ground black pepper\n" +
                    "Salt\n" +
                    "Fresh parsley, chopped (for garnish)\n" +
                    "Procedure:\n" +
                    "\n" +
                    "Bring a large pot of salted water to a boil and cook the spaghetti according to the package instructions until al dente. Reserve about 1 cup of pasta water and drain the rest.\n" +
                    "While the pasta is cooking, whisk together the eggs, grated Pecorino Romano cheese, and a generous amount of freshly ground black pepper in a bowl. Set aside.\n" +
                    "In a large skillet, cook the diced pancetta or guanciale over medium heat until crispy and golden brown. Remove the skillet from heat.\n" +
                    "Add the drained spaghetti to the skillet with the cooked pancetta/guanciale and toss to coat the pasta with the rendered fat.\n" +
                    "Pour the egg and cheese mixture over the pasta and quickly toss until the heat from the pasta cooks the eggs, forming a creamy sauce. If needed, add a little pasta water to achieve the desired consistency.\n" +
                    "Season with salt and more black pepper if desired. Garnish with chopped parsley before serving.\n"));
            lists.add(new ModelDish(R.drawable.margheritapizza,"Margherita Pizza","Ingredients:\n" +
                    "\n" +
                    "1 pizza dough (store-bought or homemade)\n" +
                    "1/2 cup pizza sauce (passata or crushed tomatoes with herbs)\n" +
                    "1 1/2 cups shredded mozzarella cheese\n" +
                    "Fresh basil leaves\n" +
                    "Extra-virgin olive oil\n" +
                    "Salt and pepper\n" +
                    "Procedure:\n" +
                    "\n" +
                    "Preheat your oven to the highest temperature (usually 500°F/260°C) or as hot as it can go. If you have a pizza stone, place it in the oven while preheating.\n" +
                    "Roll out the pizza dough on a floured surface into your desired shape (round or rectangular).\n" +
                    "Transfer the rolled-out dough onto a parchment paper-lined pizza peel or baking sheet.\n" +
                    "Spread the pizza sauce evenly over the dough, leaving a small border around the edges.\n" +
                    "Sprinkle the shredded mozzarella cheese over the sauce.\n" +
                    "Tear or chop the fresh basil leaves and scatter them on top of the cheese.\n" +
                    "Drizzle a little extra-virgin olive oil over the pizza and season with salt and pepper to taste.\n" +
                    "Carefully slide the pizza (on the parchment paper) onto the preheated pizza stone or directly onto the oven rack.\n" +
                    "Bake the pizza for about 10-12 minutes or until the crust is golden and the cheese is bubbly and slightly browned.\n" +
                    "Remove the pizza from the oven, let it cool for a minute, then slice and serve hot.\n"));
            lists.add(new ModelDish(R.drawable.chickenparmigiana,"Chicken Parmigiana ","Ingredients:\n" +
                    "\n" +
                    "4 boneless, skinless chicken breasts\n" +
                    "Salt and pepper\n" +
                    "1 cup all-purpose flour\n" +
                    "2 large eggs, beaten\n" +
                    "1 cup breadcrumbs (preferably Italian-style)\n" +
                    "1/2 cup grated Parmesan cheese\n" +
                    "2 cups marinara sauce\n" +
                    "1 1/2 cups shredded mozzarella cheese\n" +
                    "Fresh basil leaves (for garnish)\n" +
                    "Olive oil (for frying)\n" +
                    "Procedure:\n" +
                    "\n" +
                    "Preheat your oven to 375°F/190°C.\n" +
                    "Place the chicken breasts between two sheets of plastic wrap and pound them to an even thickness (about 1/2 inch) using a meat mallet or a rolling pin. Season both sides with salt and pepper.\n" +
                    "Set up a breading station: Place the flour in one shallow dish, beaten eggs in another dish, and combine the breadcrumbs with grated Parmesan cheese in a third dish.\n" +
                    "Dredge each chicken breast in the flour, shaking off any excess. Dip it into the beaten eggs, letting any excess egg drip off. Finally, coat the chicken in the breadcrumb-Parmesan mixture, pressing gently to adhere the crumbs.\n" +
                    "Heat enough olive oil in a large skillet over medium heat. Fry the breaded chicken breasts for about 3-4 minutes per side, or until golden brown and cooked through. Transfer the cooked chicken to a paper towel-lined plate to drain any excess oil.\n" +
                    "In a baking dish, spread a thin layer of marinara sauce. Place the fried chicken breasts on top.\n" +
                    "Spoon the remaining marinara sauce over the chicken and sprinkle shredded mozzarella cheese on top.\n" +
                    "Bake in the preheated oven for 15-20 minutes, or until the cheese is melted and bubbly.\n" +
                    "Garnish with fresh basil leaves before serving.\n"));
            lists.add(new ModelDish(R.drawable.tiramisu,"Tiramisu","Ingredients:\n" +
                    "\n" +
                    "1 cup heavy whipping cream\n" +
                    "1 cup mascarpone cheese\n" +
                    "1/4 cup granulated sugar\n" +
                    "1 teaspoon vanilla extract\n" +
                    "1 cup strong brewed coffee or espresso, cooled\n" +
                    "2 tablespoons coffee liqueur (optional)\n" +
                    "24-30 ladyfingers\n" +
                    "Unsweetened cocoa powder, for dusting\n" +
                    "Dark chocolate shavings or cocoa nibs, for garnish\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a large mixing bowl, whip the heavy cream until stiff peaks form.\n" +
                    "In another bowl, whisk together the mascarpone cheese, granulated sugar, and vanilla extract until smooth and creamy.\n" +
                    "Gently fold the whipped cream into the mascarpone mixture until well combined. Be careful not to deflate the whipped cream.\n" +
                    "In a shallow dish, combine the cooled brewed coffee or espresso with the coffee liqueur if using.\n" +
                    "Quickly dip each ladyfinger into the coffee mixture, ensuring they are soaked but not soggy.\n" +
                    "Arrange a layer of soaked ladyfingers at the bottom of a rectangular or square serving dish.\n" +
                    "Spread half of the mascarpone mixture over the ladyfingers, creating an even layer.\n" +
                    "Repeat with another layer of soaked ladyfingers and top with the remaining mascarpone mixture.\n" +
                    "Cover the dish with plastic wrap and refrigerate for at least 4 hours (preferably overnight) to allow the flavors to meld and the tiramisu to set.\n" +
                    "Before serving, dust the top with unsweetened cocoa powder and garnish with dark chocolate shavings or cocoa nibs."));
            recyclerview.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
            adapterdish=new Adapterdish(lists,getApplicationContext());
            recyclerview.setAdapter(adapterdish);
        }else if(name.equals("Chinese Foods")){
            lists=new ArrayList<>();
            lists.add(new ModelDish(R.drawable.kungpaochicken,"Kung Pao Chicken","Ingredients:\n" +
                    "\n" +
                    "500g boneless chicken, cut into bite-sized pieces\n" +
                    "1/2 cup roasted peanuts\n" +
                    "3-4 dried red chili peppers, sliced\n" +
                    "3-4 cloves garlic, minced\n" +
                    "1-inch piece of ginger, minced\n" +
                    "3 green onions, chopped\n" +
                    "2 tablespoons vegetable oil\n" +
                    "2 tablespoons soy sauce\n" +
                    "1 tablespoon dark soy sauce\n" +
                    "1 tablespoon Chinese rice wine or dry sherry\n" +
                    "1 tablespoon hoisin sauce\n" +
                    "1 tablespoon cornstarch\n" +
                    "1 teaspoon sugar\n" +
                    "1 teaspoon Sichuan peppercorns (optional for extra spice)\n" +
                    "Salt and pepper to taste\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a bowl, marinate the chicken with soy sauce, Chinese rice wine, and cornstarch. Set aside for 15-20 minutes.\n" +
                    "In a wok or large skillet, heat vegetable oil over medium-high heat. Add minced garlic, ginger, and sliced dried red chili peppers. Stir-fry for about 1 minute until fragrant.\n" +
                    "Add the marinated chicken to the wok and stir-fry until the chicken is cooked through and slightly browned.\n" +
                    "Add the dark soy sauce, hoisin sauce, sugar, and Sichuan peppercorns (if using) to the wok. Toss everything together to coat the chicken evenly with the sauce.\n" +
                    "Stir in the roasted peanuts and chopped green onions. Cook for an additional minute.\n" +
                    "Taste and adjust seasoning with salt and pepper as needed.\n" +
                    "Serve the Kung Pao Chicken hot with steamed rice."));
            lists.add(new ModelDish(R.drawable.beefbroccoli,"Beef Broccoli","Ingredients:\n" +
                    "\n" +
                    "500g beef sirloin, thinly sliced\n" +
                    "2 cups broccoli florets\n" +
                    "3 cloves garlic, minced\n" +
                    "1-inch piece of ginger, minced\n" +
                    "1/4 cup soy sauce\n" +
                    "2 tablespoons oyster sauce\n" +
                    "1 tablespoon cornstarch\n" +
                    "1 tablespoon vegetable oil\n" +
                    "1 teaspoon sesame oil\n" +
                    "1 teaspoon sugar\n" +
                    "1/2 cup beef broth or water\n" +
                    "Salt and pepper to taste\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a bowl, mix soy sauce, oyster sauce, cornstarch, sugar, and beef broth (or water). Add the sliced beef to the mixture and marinate for about 20-30 minutes.\n" +
                    "In a wok or large skillet, heat vegetable oil over high heat. Add minced garlic and ginger, and stir-fry for a few seconds until aromatic.\n" +
                    "Add the marinated beef to the wok and stir-fry until the beef is browned and cooked to your desired doneness. Remove the beef from the wok and set it aside.\n" +
                    "In the same wok, add the broccoli florets and stir-fry for a few minutes until they become tender-crisp.\n" +
                    "Return the cooked beef to the wok, and drizzle with sesame oil. Toss everything together to combine.\n" +
                    "Season with salt and pepper to taste.\n" +
                    "Serve the Beef and Broccoli Stir-Fry hot with steamed rice.\n"));
            lists.add(new ModelDish(R.drawable.springrolls,"Spring Rolls","Ingredients:\n" +
                    "\n" +
                    "12 spring roll wrappers (store-bought or homemade)\n" +
                    "1 cup shredded cabbage\n" +
                    "1 cup shredded carrots\n" +
                    "1 cup bean sprouts\n" +
                    "1/2 cup sliced bell peppers\n" +
                    "2 cloves garlic, minced\n" +
                    "1-inch piece of ginger, minced\n" +
                    "2 tablespoons soy sauce\n" +
                    "1 tablespoon oyster sauce\n" +
                    "1 tablespoon cornstarch\n" +
                    "1 tablespoon vegetable oil\n" +
                    "Oil for frying\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a wok or large skillet, heat vegetable oil over medium-high heat. Add minced garlic and ginger, and sauté for a few seconds until fragrant.\n" +
                    "Add shredded cabbage, carrots, bean sprouts, and sliced bell peppers to the wok. Stir-fry for a couple of minutes until the vegetables are slightly cooked but still retain their crunch.\n" +
                    "In a small bowl, mix soy sauce, oyster sauce, and cornstarch. Pour the sauce mixture over the vegetables and stir-fry for another minute until the vegetables are evenly coated with the sauce.\n" +
                    "Remove the wok from the heat and let the filling cool down to room temperature.\n" +
                    "Take one spring roll wrapper at a time and place it on a clean surface. Spoon a portion of the vegetable filling onto the wrapper and fold the sides inward. Roll the wrapper tightly from the bottom, sealing the edge with a little water.\n" +
                    "Heat oil in a deep frying pan or a wok. Once the oil is hot, deep fry the spring rolls until they turn golden brown and crispy.\n" +
                    "Remove the spring rolls from the oil and drain them on paper towels to remove excess oil.\n" +
                    "Serve the Vegetable Spring Rolls hot with your favorite dipping sauce."));
            lists.add(new ModelDish(R.drawable.eggfriedrice,"Egg Fried Rice","Ingredients:\n" +
                    "\n" +
                    "2 cups cooked rice (preferably leftover and cooled)\n" +
                    "2 large eggs, lightly beaten\n" +
                    "1 cup mixed vegetables (peas, carrots, corn)\n" +
                    "2 cloves garlic, minced\n" +
                    "2 tablespoons soy sauce\n" +
                    "1 tablespoon oyster sauce\n" +
                    "1 tablespoon vegetable oil\n" +
                    "1/2 teaspoon sesame oil (optional)\n" +
                    "2 green onions, chopped\n" +
                    "Salt and pepper to taste\n" +
                    "Procedure:\n" +
                    "\n" +
                    "Heat vegetable oil in a wok or large skillet over medium-high heat. Add minced garlic and stir-fry for a few seconds until aromatic.\n" +
                    "Push the garlic to one side of the wok and pour the beaten eggs into the other side. Scramble the eggs until they are just cooked.\n" +
                    "Add the mixed vegetables to the wok and stir-fry for a few minutes until they are heated through and tender.\n" +
                    "Add the cooked rice to the wok, breaking up any clumps with a spatula. Toss everything together to combine.\n" +
                    "Drizzle soy sauce and oyster sauce over the rice and mix well until the rice is evenly coated.\n" +
                    "If using, add sesame oil for extra flavor and toss again.\n" +
                    "Stir in the chopped green onions.\n" +
                    "Season with salt and pepper to taste.\n" +
                    "Serve the Egg Fried Rice hot as a standalone dish or as a side with other Chinese dishes."));
            recyclerview.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
            adapterdish=new Adapterdish(lists,getApplicationContext());
            recyclerview.setAdapter(adapterdish);
        }else if(name.equals("Russian Foods")){
            lists=new ArrayList<>();
            lists.add(new ModelDish(R.drawable.chickenstroganoff,"Chicken Stroganoff","Ingredients:\n" +
                    "\n" +
                    "500g boneless chicken breasts, thinly sliced\n" +
                    "1 onion, finely chopped\n" +
                    "2 cloves garlic, minced\n" +
                    "250g button mushrooms, sliced\n" +
                    "2 tablespoons butter\n" +
                    "2 tablespoons vegetable oil\n" +
                    "2 tablespoons all-purpose flour\n" +
                    "1 cup chicken broth\n" +
                    "1 cup sour cream\n" +
                    "2 tablespoons Dijon mustard\n" +
                    "Salt and pepper to taste\n" +
                    "Fresh parsley, chopped (for garnish)\n" +
                    "300g cooked egg noodles (for serving)\n" +
                    "Procedure:\n" +
                    "\n" +
                    "Heat 1 tablespoon of butter and 1 tablespoon of oil in a large skillet over medium heat. Add the chicken slices and cook until lightly browned and cooked through. Remove the chicken from the skillet and set aside.\n" +
                    "\n" +
                    "In the same skillet, add the remaining butter and oil. Sauté the onions until translucent, then add the minced garlic and mushrooms. Cook until the mushrooms are tender and any excess liquid evaporates.\n" +
                    "\n" +
                    "Sprinkle the flour over the mushrooms and onions, stirring to combine. Gradually pour in the chicken broth while stirring continuously to avoid lumps.\n" +
                    "\n" +
                    "Bring the mixture to a simmer, then stir in the sour cream and Dijon mustard. Season with salt and pepper to taste.\n" +
                    "\n" +
                    "Return the cooked chicken to the skillet, coating it well with the creamy sauce. Simmer for a few minutes until everything is heated through and the flavors are well combined.\n" +
                    "\n" +
                    "Serve the Chicken Stroganoff over cooked egg noodles and garnish with chopped fresh parsley."));
            lists.add(new ModelDish(R.drawable.chickenkotleti,"Chicken Kotleti","Ingredients:\n" +
                    "\n" +
                    "500g ground chicken\n" +
                    "1 small onion, finely grated\n" +
                    "1 clove garlic, minced\n" +
                    "1/4 cup bread crumbs\n" +
                    "1 egg, lightly beaten\n" +
                    "2 tablespoons milk\n" +
                    "2 tablespoons fresh dill, chopped\n" +
                    "Salt and pepper to taste\n" +
                    "2-3 tablespoons vegetable oil (for frying)\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a large mixing bowl, combine the ground chicken, grated onion, minced garlic, bread crumbs, beaten egg, milk, and chopped dill. Season with salt and pepper.\n" +
                    "\n" +
                    "Mix everything thoroughly until well combined. Form the mixture into small meatballs and flatten them slightly.\n" +
                    "\n" +
                    "Heat the vegetable oil in a skillet over medium heat. Fry the meatballs in batches until golden brown and cooked through, about 3-4 minutes per side.\n" +
                    "\n" +
                    "Remove the Chicken Kotleti from the skillet and place them on a plate lined with paper towels to drain any excess oil.\n" +
                    "\n" +
                    "Serve the Chicken Kotleti hot with your favorite side dishes, such as mashed potatoes or salad.\n" +
                    "\n"));
            lists.add(new ModelDish(R.drawable.russianborscht,"Russian Borscht","Ingredients:\n" +
                    "\n" +
                    "2 large beets, peeled and grated\n" +
                    "1 large potato, peeled and diced\n" +
                    "1 carrot, peeled and grated\n" +
                    "1 onion, finely chopped\n" +
                    "2 cloves garlic, minced\n" +
                    "2 tablespoons vegetable oil\n" +
                    "4 cups beef or vegetable broth\n" +
                    "2 cups shredded cabbage\n" +
                    "2 tablespoons tomato paste\n" +
                    "1 bay leaf\n" +
                    "1 tablespoon sugar\n" +
                    "2 tablespoons vinegar\n" +
                    "Salt and pepper to taste\n" +
                    "Sour cream and fresh dill (for garnish)\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a large pot, heat the vegetable oil over medium heat. Add the chopped onion and sauté until it becomes translucent.\n" +
                    "\n" +
                    "Add the grated beets, grated carrot, and minced garlic to the pot. Cook for a few minutes until the vegetables are slightly softened.\n" +
                    "\n" +
                    "Pour in the beef or vegetable broth and add the diced potatoes, shredded cabbage, tomato paste, and bay leaf. Stir everything together and bring the soup to a simmer.\n" +
                    "\n" +
                    "Add sugar and vinegar to the soup. Season with salt and pepper according to your taste.\n" +
                    "\n" +
                    "Cover the pot and let the Borscht simmer for about 30-40 minutes, or until the vegetables are tender.\n" +
                    "\n" +
                    "Remove the bay leaf from the soup before serving. Garnish each bowl with a dollop of sour cream and a sprinkle of fresh dill."));
            lists.add(new ModelDish(R.drawable.oliviersalad,"Olivier Salad","Ingredients:\n" +
                    "\n" +
                    "3 large potatoes, boiled and diced\n" +
                    "2 large carrots, boiled and diced\n" +
                    "1 cup frozen peas, boiled\n" +
                    "1 cup cooked and diced ham or bologna\n" +
                    "1 cup dill pickles, diced\n" +
                    "1/2 cup green onions, finely chopped\n" +
                    "1 cup mayonnaise\n" +
                    "2 tablespoons Dijon mustard\n" +
                    "Salt and pepper to taste\n" +
                    "Fresh dill (for garnish)\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a large mixing bowl, combine the diced potatoes, diced carrots, boiled peas, diced ham or bologna, diced dill pickles, and chopped green onions.\n" +
                    "\n" +
                    "In a separate small bowl, mix the mayonnaise and Dijon mustard together until well combined. Season with salt and pepper according to your taste.\n" +
                    "\n" +
                    "Pour the dressing over the vegetable mixture in the large bowl and gently toss everything together until all the ingredients are coated with the dressing.\n" +
                    "\n" +
                    "Cover the bowl with plastic wrap and refrigerate the salad for at least 1 hour before serving to allow the flavors to meld.\n" +
                    "\n" +
                    "Serve the Olivier Salad chilled, garnished with fresh dill on top."));
            recyclerview.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
            adapterdish=new Adapterdish(lists,getApplicationContext());
            recyclerview.setAdapter(adapterdish);
        }else if(name.equals("Fast Foods")){
            lists=new ArrayList<>();
            lists.add(new ModelDish(R.drawable.chickentenders,"Chicken Tenders","Ingredients:\n" +
                    "\n" +
                    "1 pound chicken tenders\n" +
                    "1 cup all-purpose flour\n" +
                    "1 teaspoon garlic powder\n" +
                    "1 teaspoon paprika\n" +
                    "1/2 teaspoon salt\n" +
                    "1/2 teaspoon black pepper\n" +
                    "2 large eggs\n" +
                    "2 tablespoons milk\n" +
                    "Vegetable oil, for frying\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a shallow dish, mix together flour, garlic powder, paprika, salt, and black pepper.\n" +
                    "In another bowl, whisk the eggs and milk together.\n" +
                    "Dip each chicken tender in the egg mixture, then coat it with the seasoned flour mixture.\n" +
                    "Heat vegetable oil in a deep skillet over medium-high heat.\n" +
                    "Fry the chicken tenders in batches until golden brown and cooked through, about 3-4 minutes per side.\n" +
                    "Remove the chicken tenders and drain on paper towels to remove excess oil.\n" +
                    "Serve hot with your favorite dipping sauce."));
            lists.add(new ModelDish(R.drawable.chickenquesadillas,"Chicken Quesadillas","Ingredients:\n" +
                    "\n" +
                    "2 cups cooked chicken, shredded\n" +
                    "1 cup shredded cheddar cheese\n" +
                    "1/2 cup diced bell peppers (any color)\n" +
                    "1/2 cup diced onions\n" +
                    "4 large flour tortillas\n" +
                    "2 tablespoons vegetable oil\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a large mixing bowl, combine the shredded chicken, shredded cheddar cheese, diced bell peppers, and diced onions.\n" +
                    "Place one-fourth of the mixture on half of a flour tortilla, then fold the tortilla in half to create a half-moon shape.\n" +
                    "Heat one tablespoon of vegetable oil in a skillet over medium heat.\n" +
                    "Cook the quesadilla for 2-3 minutes on each side until the tortilla turns golden brown and the cheese melts.\n" +
                    "Repeat the process with the remaining tortillas and filling.\n" +
                    "Cut each quesadilla into wedges and serve with salsa and sour cream."));
            lists.add(new ModelDish(R.drawable.zucchinifritters,"Zucchini Fritters","Ingredients:\n" +
                    "\n" +
                    "2 cups grated zucchini\n" +
                    "1/2 cup all-purpose flour\n" +
                    "1/4 cup grated Parmesan cheese\n" +
                    "1 large egg, lightly beaten\n" +
                    "1/4 cup chopped fresh parsley\n" +
                    "2 cloves garlic, minced\n" +
                    "Salt and pepper to taste\n" +
                    "2-3 tablespoons vegetable oil\n" +
                    "Procedure:\n" +
                    "\n" +
                    "Place the grated zucchini in a clean kitchen towel and squeeze out as much moisture as possible.\n" +
                    "In a mixing bowl, combine the grated zucchini, all-purpose flour, grated Parmesan cheese, lightly beaten egg, chopped parsley, minced garlic, salt, and pepper. Mix well until the ingredients are evenly distributed.\n" +
                    "Heat vegetable oil in a skillet over medium heat.\n" +
                    "Drop spoonfuls of the zucchini mixture into the skillet and flatten them slightly with the back of the spoon to form fritters.\n" +
                    "Cook the fritters for 2-3 minutes on each side or until they turn golden brown and crispy.\n" +
                    "Remove the fritters from the skillet and place them on a paper towel-lined plate to remove any excess oil.\n" +
                    "Serve the crispy zucchini fritters with a side of dipping sauce, like sour cream or tzatziki."));
            lists.add(new ModelDish(R.drawable.veggienachos,"Veggie Nachos","Ingredients:\n" +
                    "\n" +
                    "1 bag tortilla chips\n" +
                    "1 cup shredded cheddar cheese\n" +
                    "1 cup black beans, drained and rinsed\n" +
                    "1 cup diced tomatoes\n" +
                    "1/2 cup sliced black olives\n" +
                    "1/4 cup diced jalapeños (optional for spice)\n" +
                    "1/4 cup chopped green onions\n" +
                    "1/4 cup sour cream\n" +
                    "1/4 cup salsa\n" +
                    "Fresh cilantro leaves for garnish\n" +
                    "Procedure:\n" +
                    "\n" +
                    "Preheat the oven to 375°F (190°C).\n" +
                    "Spread the tortilla chips in a single layer on a large baking sheet.\n" +
                    "Sprinkle the shredded cheddar cheese evenly over the chips.\n" +
                    "Scatter the black beans, diced tomatoes, black olives, and diced jalapeños (if using) on top of the cheese.\n" +
                    "Bake the nachos in the preheated oven for about 8-10 minutes or until the cheese is melted and bubbly.\n" +
                    "Remove the nachos from the oven and drizzle with sour cream and salsa.\n" +
                    "Garnish with chopped green onions and fresh cilantro leaves.\n" +
                    "Serve the veggie nachos immediately as a delicious and flavorful snack."));
            recyclerview.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
            adapterdish=new Adapterdish(lists,getApplicationContext());
            recyclerview.setAdapter(adapterdish);
        }else if(name.equals("Afghani Foods")){
            lists=new ArrayList<>();
            lists.add(new ModelDish(R.drawable.kabulipulao,"Kabuli Pulao","Ingredients:\n" +
                    "\n" +
                    "2 cups Basmati rice, soaked for 30 minutes and drained\n" +
                    "500g chicken, cut into pieces\n" +
                    "1 large onion, thinly sliced\n" +
                    "3 cloves garlic, minced\n" +
                    "2 carrots, peeled and julienned\n" +
                    "1/2 cup raisins\n" +
                    "1/2 cup chopped almonds\n" +
                    "1/4 cup cooking oil\n" +
                    "1 teaspoon cumin powder\n" +
                    "1 teaspoon coriander powder\n" +
                    "1/2 teaspoon cardamom powder\n" +
                    "1/2 teaspoon black pepper\n" +
                    "Salt to taste\n" +
                    "4 cups chicken broth\n" +
                    "2 tablespoons butter\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a large pot, heat the cooking oil and sauté the sliced onions until they turn golden brown.\n" +
                    "Add the minced garlic and chicken pieces to the pot. Cook until the chicken is lightly browned.\n" +
                    "Stir in the cumin powder, coriander powder, cardamom powder, black pepper, and salt. Cook for another 2 minutes.\n" +
                    "Add the julienned carrots, raisins, and chopped almonds to the pot. Mix everything together.\n" +
                    "Pour the chicken broth into the pot and bring it to a boil. Reduce the heat to low, cover the pot, and let it simmer for about 20 minutes or until the chicken is fully cooked.\n" +
                    "Meanwhile, in a separate pot, boil the soaked and drained rice until it's almost cooked. Drain any excess water.\n" +
                    "Layer the cooked rice over the chicken mixture in the large pot. Dot the rice with butter.\n" +
                    "Cover the pot with a lid and let it cook on low heat for another 15-20 minutes until the rice is fully cooked and fluffy.\n" +
                    "Gently fluff the rice and chicken with a fork, and your Chicken Kabuli Pulao is ready to be served.\n"));
            lists.add(new ModelDish(R.drawable.chickenkorma,"Chicken Korma","Ingredients:\n" +
                    "\n" +
                    "500g chicken, cut into pieces\n" +
                    "1 large onion, finely chopped\n" +
                    "3 cloves garlic, minced\n" +
                    "1-inch piece of ginger, grated\n" +
                    "1/2 cup plain yogurt\n" +
                    "1/4 cup heavy cream\n" +
                    "2 tablespoons vegetable oil\n" +
                    "1/4 cup blanched almonds\n" +
                    "1/4 cup cashew nuts\n" +
                    "1 teaspoon cumin powder\n" +
                    "1 teaspoon coriander powder\n" +
                    "1/2 teaspoon turmeric powder\n" +
                    "1/2 teaspoon garam masala\n" +
                    "1/4 teaspoon chili powder (adjust to your spice preference)\n" +
                    "Salt to taste\n" +
                    "Fresh cilantro, for garnish\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a blender, make a smooth paste by blending together the chopped onions, minced garlic, grated ginger, blanched almonds, and cashew nuts.\n" +
                    "In a large skillet, heat the vegetable oil and add the chicken pieces. Cook until they are lightly browned on all sides. Remove the chicken from the skillet and set aside.\n" +
                    "In the same skillet, add the blended paste and cook it on medium heat until it turns golden and releases its aroma.\n" +
                    "Add the cumin powder, coriander powder, turmeric powder, chili powder, and salt to the paste. Stir well and cook for a minute.\n" +
                    "Return the chicken pieces to the skillet and mix them with the spice paste.\n" +
                    "Pour in the plain yogurt and bring it to a gentle simmer. Cover the skillet and cook on low heat for about 15-20 minutes or until the chicken is cooked through and tender.\n" +
                    "Stir in the heavy cream and garam masala. Cook for an additional 5 minutes.\n" +
                    "Garnish with fresh cilantro and serve your creamy Chicken Korma with naan or rice."));
            lists.add(new ModelDish(R.drawable.booranibanjan,"Borani Banjan","Ingredients:\n" +
                    "\n" +
                    "2 large eggplants, sliced into rounds\n" +
                    "1 cup plain yogurt\n" +
                    "2 large tomatoes, diced\n" +
                    "3 cloves garlic, minced\n" +
                    "1/4 cup cooking oil\n" +
                    "1 teaspoon ground coriander\n" +
                    "1/2 teaspoon ground turmeric\n" +
                    "1/2 teaspoon paprika\n" +
                    "1/2 teaspoon dried mint leaves\n" +
                    "Salt to taste\n" +
                    "Fresh cilantro, for garnish\n" +
                    "Procedure:\n" +
                    "\n" +
                    "Sprinkle salt on the eggplant slices and let them sit for about 15 minutes to remove excess moisture. Pat them dry with a paper towel.\n" +
                    "In a large skillet, heat the cooking oil and fry the eggplant slices until they are golden brown on both sides. Remove and set them aside on a paper towel to drain any excess oil.\n" +
                    "In the same skillet, add the minced garlic and cook until it becomes fragrant.\n" +
                    "Add the diced tomatoes, ground coriander, ground turmeric, paprika, and salt. Cook until the tomatoes are softened and the spices are well combined.\n" +
                    "Place the fried eggplant slices on top of the tomato mixture in the skillet.\n" +
                    "Gently spread the plain yogurt over the eggplant slices, covering them evenly.\n" +
                    "Reduce the heat to low, cover the skillet, and let it simmer for about 10 minutes to allow the flavors to meld together.\n" +
                    "Sprinkle dried mint leaves\n" +
                    "\n" +
                    "\n" +
                    "\n"));
            lists.add(new ModelDish(R.drawable.koftachallow,"Kofta Challow","Ingredients:\n" +
                    "\n" +
                    "500g ground beef or lamb\n" +
                    "1 large onion, finely chopped\n" +
                    "2 cloves garlic, minced\n" +
                    "1 cup cooked chickpeas\n" +
                    "2 cups chopped tomatoes\n" +
                    "1 tablespoon tomato paste\n" +
                    "1 teaspoon ground turmeric\n" +
                    "1 teaspoon ground coriander\n" +
                    "1 teaspoon ground cumin\n" +
                    "1 teaspoon paprika\n" +
                    "Salt and pepper to taste\n" +
                    "2 tablespoons vegetable oil\n" +
                    "4 cups water\n" +
                    "Procedure:\n" +
                    "\n" +
                    "In a bowl, mix the ground meat with chopped onions, minced garlic, ground coriander, ground cumin, paprika, salt, and pepper.\n" +
                    "\n" +
                    "Shape the mixture into small meatballs and set them aside.\n" +
                    "\n" +
                    "In a pot, heat vegetable oil and sauté the chopped tomatoes and tomato paste until they form a thick sauce.\n" +
                    "\n" +
                    "Add the cooked chickpeas, ground turmeric, and water. Bring the mixture to a boil.\n" +
                    "\n" +
                    "Carefully add the meatballs to the stew and let it simmer on low heat until the meatballs are fully cooked and the stew thickens."));
            recyclerview.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
            adapterdish=new Adapterdish(lists,getApplicationContext());
            recyclerview.setAdapter(adapterdish);
        }else{
            Toast.makeText(this, "Sorry", Toast.LENGTH_SHORT).show();
        }


    }
}