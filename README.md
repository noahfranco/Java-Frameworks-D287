## Repo originally worked on GitLab
## GitLab commit History
<img width="1780" alt="Noah's Computer Shop Java D287 PA Git Branch History " src="https://github.com/user-attachments/assets/38ffb573-3051-4ba3-a79b-75749c224410" />

GitLab - https://gitlab.com/nfra190

## Part C
### Prompt
- Renamed title and headers to reflect Noah's Computer Shop.
### File Name
- mainscreen.html
### Line Number
- 14, 19, 21, 53.

## Part D
### Prompt
- Added about page describing Noah's Computer Shop and some of the services we provide.
### File Name
- about.html and mainscreen.html
### Line Number
- 1 - 31 for about.html page.
- 19 - 22 for mainscreen.html

## Part E
### Prompt
- Added a sample inventory that runs when part and product tables are empty.
### File Name
- BootStrapData.java
### Line Number
- lines 50 - 106.

## Part F
### Prompt
- Added a buy now button in products so users can purchase a product.
- When users purchases a product successfully we decrement the inventory of that product by one.
- The user is able to see a success screen or a failed screen depending on if they purchased a product successfully or not. 
### File Name
- AddProductController.java
- mainscreen.html
- boughtproducterror.html
- boughtproductsuccessfully.html
### Line Number
- In AddProductController.java file lines 179 - 195.
- In mainscreen.html file line 89.
- In boughtproducterror.html new file so lines 1 - 16.
- In boughtproductsuccessfully.html new file so lines 1 - 13.

## Part G
### Prompt
- Added minInv and maxInv.
- Added min and max inputs and display.
- Added inventory validators.
- Modify the sample inventory to have min and max.
- Enforce that the inventory is between or at the minimum and maximum value.
### File Name
- BootStrapData.java
- InhousePartForm.html
- InventoryValidator.java
- ValidInventory.java
- mainscreen.html
- OutsourcedPartForm.html
- Part.java
### Line Number
- BootStrapData.java
  - 73, 74 adds minInv and maxInv to Apple part.
  - 83, 84 adds minInv and maxInv to Dell part.
  - 93, 94 adds minInv and maxInv to HP part.
  - 103, 104 adds minInv and maxInv to Logitech part.
  - 113, 114 adds minInv and maxInv to Nvidia part.
- InhousePartForm.html
  - 24 - 29 min and max inventory inputs.
  - 32 - 35 handles display input validation errors.
- InventoryValidator.java
  - 1 - 31 added new validator to enforce that the inventory is between or at the minimum and maximum value.
- ValidInventory.java
  - 1 - 17 added new validator interface.
- mainscreen.html
  - 41 - 42 Min and Max Inventory tab.
  - 51 -52 minInv and maxInv values.
- OutsourcedPartForm.html
  - 24 - 29 min and max inventory inputs.
  - 33 - 36 handles display input validation errors.
- Part.java
  - 34 - 37 added min and max int.
  - 51 -52 added min and max to Part class.
  - 96 - 104 added min and max get and set methods.

## Part H
### Prompt
-  Added logic to isValid function in EnufPartsValidator to check if adding to product inventory decreases the parts in associated parts inventory amount less than that parts minimum inventory. 
- Added to productForm the min and max tab and values.
- Already displaying error messages for low inventor (handled this in part G).
- Already displaying error messages when adding and updating parts if the inventory is greater than the maximum (handled this in part G).
### File Name
- EnufPartsValidator.java
- productForm.html
### Line Number
- 38 - 44 in EnufPartsValidator.java
- EnufPartsValidator.java
  - 40 -41
  - 50 -51
  - 64 - 65
  - 74 - 75

## Part I
### Prompt
- Added four test to PartTest for getMinInv, setMinInv, getMaxInv, and setMaxInv methods.

### File Name
- PartTest.java

### Line Number
- 103 - 139

## Part J
### Prompt
- Removed unused DeletePartValidator class.
### File Name
- DeletePartValidator
### Line Number
- removed file.
