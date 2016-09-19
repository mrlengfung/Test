package test.automation.pageconstant;

import test.automation.base.ALMIntegration;

/**
 * Created by mmasi03 on 11/5/2015.
 */
public class GlobalConstants {

    public static final String GRIDHUB = "http://localhost:4444/wd/hub";
    public static final String emailProviderLink = "https://mail.google.com";
    public static String objectMapperDefPath;
    public static final String testDataFileName = "J4U_TestData.xlsx";
    public static final String testDataFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\";
    public static final String driversIEChromePath = "C:\\selenium\\";
    public static final long thirtyMinutes = 1800000;
    public static String generalTestCaseStatus = "Passed";

    public static ALMIntegration almConnect = null;

    public static int stepNo = 0;
    public static String stepDescription = null;
    public static String stepExpected = null;
    public static String stepPassActual = null;
    public static String stepFailActual = null;
    public static String stepStatus = null;
    public static String testCaseName = null;

    public enum VerifyTextOptions {
        EXACTMATCH,
        EXACTMATCHIGNORECASE,
        PARTIAL
    }

    public enum buttonType {
        ADD,ADDED
    }

    public enum HomePage {
        PAGE_WEBELEMENT {
            @Override
            public String toString() { return "Home.Page.WebElement"; }
        },

        SIGN_IN_LINK {
            @Override
            public String toString() { return "Home.SignIn.Link"; }
        },

        YES_SELECT_STORE_BUTTON {
            @Override
            public String toString() { return "Home.YesSelectStore.Button"; }
        },

        LOGIN_GREETINGS_WEBELEMENT {
            @Override
            public String toString() { return "Home.LoginGreetings.WebElement"; }
        },

        SIGN_OUT_LINK {
            @Override
            public String toString() { return "Home.SignOut.Link"; }
        },

        MY_ACCOUNT_LINK {
            @Override
            public String toString() { return "Home.MyAccount.Link"; }
        },

        CHANGE_MY_STORE_LINK {
            @Override
            public String toString() { return "Home.ChangeMyStore.Link"; }
        },

        STORE_LOCATOR_LINK {
            @Override
            public String toString() { return "Home.StoreLocator.Link"; }
        },

        REGISTER_LINK {
            @Override
            public String toString() { return "Home.Register.Link"; }
        },

        JUST_FOR_U_TAB {
            @Override
            public String toString() { return "Home.JustForU.Tab"; }
        },

        OUR_STORE_TAB {
            @Override
            public String toString() { return "Home.OurStore.Tab"; }
        },

        RECIPE_MEALS_TAB {
            @Override
            public String toString() { return "Home.RecipesMeals.Tab"; }
        },

        PHARMACY_NUTRITION_TAB {
            @Override
            public String toString() { return "Home.PharmacyNutrition.Tab"; }
        },

        GROCERY_DELIVERY_TAB {
            @Override
            public String toString() { return "Home.GroceryDelivery.Tab"; }
        },

        WEEKLY_AD_TAB {
            @Override
            public String toString() { return "Home.WeeklyAd.Tab"; }
        },

        J4U_LITE_MOCK_ID_ENTRY_EDIT {
            @Override
            public String toString() { return "Home.J4ULiteMockIDEntry.Edit"; }
        },

        J4U_LITE_ERROR_SEARCH_BOX_EDIT {
            @Override
            public String toString() { return "Home.J4ULiteErrorSearchBox.Edit"; }
        },


        VIEW_OFFERS_BUTTON {
            @Override
            public String toString() { return "Home.ViewOffers.Button"; }
        },

        CHANGE_MY_STORE_NO_BUTTON {
            @Override
            public String toString() { return "Home.ChangeMyStoreNo.Button"; }
        },

        PREFERRED_STORE_ADDRESS_WEBELEMENT {
            @Override
            public String toString() { return "Home.PreferredStoreAddress.WebElement"; }
        },

        NOT_USING_J4U_WEBELEMENT {
            @Override
            public String toString() { return "Home.NotUsingJ4U.WebElement"; }
        },

        BANNER_IMAGE {
            @Override
            public String toString() { return "Home.Banner.Image"; }
        },

        HEADER_GAS_REWARDS_LINK {
            @Override
            public String toString() { return "Home.HeaderGasRewards.Link"; }
        },

        HEADER_GROCERY_DELIVERY_LINK {
            @Override
            public String toString() { return "Home.HeaderGroceryDelivery.Link"; }
        },

        J4UL_ERROR_MESSAGE_WEBELEMENT {
            @Override
            public String toString() { return "Home.J4ULiteErrorMessage.WebElement"; }
        },

        MAKE_THIS_MY_STORE_RIGHT_BUTTON {
            @Override
            public String toString() { return "Home.MakeThisMyStoreRight.Button"; }
        },

        MAKE_THIS_MY_STORE_lEFT_BUTTON {
            @Override
            public String toString() { return "Home.MakeThisMyStoreLeft.Button"; }
        },

    }

    public enum J4ULitePage {
        YOUR_TOP_OFFERS_HEADER_WEBELEMENT {
            @Override
            public String toString() { return "J4ULite.YourTopOffersHeader.WebElement"; }
        },

        ADD_ALL_OFFERS_BUTTON {
            @Override
            public String toString() { return "J4ULite.AddAllOffers.Button"; }
        },

        FIRST_OFFER_WEBELEMENT {
            @Override
            public String toString() { return "J4ULite.FirstOffer.WebElement"; }
        },

        OFFER_DESCRIPTION_LINK {
            @Override
            public String toString() { return "J4ULite.OfferDescription.Link"; }
        },

        LOADING_WEBELEMENT {
            @Override
            public String toString() { return "J4ULite.Loading.WebElement"; }
        },

        POPUP_OFFER_TYPE_WEBELEMENT {
            @Override
            public String toString() { return "J4ULite.PopUpOfferType.WebElement"; }
        },

        POPUP_CLOSE_LINK {
            @Override
            public String toString() { return "J4ULite.PopUpClose.Link"; }
        },

        ADDED_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "J4ULite.AddedByIndex.WebElement"; }
        },

        ADD_BUTTON_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "J4ULite.AddButtonByIndex.WebElement"; }
        },
        ADDED_ALL_OFFERS_WEBELEMENT {
            @Override
            public String toString() { return "J4ULite.AllOffersAdded.Webelement"; }
        },

        ERROR_MESSAGE_WEBELEMENT {
            @Override
            public String toString() { return "J4ULite.ErrorMessage.WebElement"; }
        },

        SEARCH_CCN_PHONE_NUMBER_EDIT {
            @Override
            public String toString() { return "J4ULite.SearchCCNPhoneNumber.Edit"; }
        },

        J4U_LOGO_WEBELEMENT {
            @Override
            public String toString() { return "J4ULite.J4ULogo.WebElement"; }
        },

        HOME_SEARCH_LABEL_WEBELEMENT {
            @Override
            public String toString() { return "J4ULite.HomeSearchLabel.WebElement"; }
        },

        VIEW_OFFERS_BUTTON {
            @Override
            public String toString() { return "J4ULite.ViewOffers.Button"; }
        },




    }

    public enum SignInPage {
        USERNAME_EDIT {
            @Override
            public String toString() { return "SignIn.UserName.Edit"; }
        },

        FAKEPASSWORD_EDIT {
            @Override
            public String toString() { return "SignIn.FakePassword.Edit"; }
        },

        PASSWORD_EDIT {
            @Override
            public String toString() { return "SignIn.Password.Edit"; }
        },

        REMEMBER_CHECKBOX {
            @Override
            public String toString() { return "SignIn.RememberMe.CheckBox"; }
        },

        SIGN_IN_BUTTON {
            @Override
            public String toString() { return "SignIn.SignIn.Button"; }
        }
    }


    public enum RegistrationData {
        SECURITY_QUESTION {
            @Override
            //public String toString() { return "What are the last four characters of your drivers license number?"; }
            public String toString() { return "Q5"; }
        },

        SECURITY_ANSWER {
            @Override
            public String toString() { return "1234"; }
        },

        REMEMBER_ME {
            @Override
            public String toString() { return "N"; }
        },

        EMAIL_OFFERS {
            @Override
            public String toString() { return "Y"; }
        },

        BANNER {
            @Override
            public String toString() { return "safeway"; }
        }

    }


    public enum RegistrationPage {

        FIRST_NAME_EDIT {
            @Override
            public String toString() { return "Register.FirstName.Edit"; }
        },

        LAST_NAME_EDIT {
            @Override
            public String toString() { return "Register.LastName.Edit"; }
        },

        CCN_EDIT {
            @Override
            public String toString() { return "Register.CCN.Edit"; }
        },

        EMAIL_ADDRESS_EDIT {
            @Override
            public String toString() { return "Register.EmailAddress.Edit"; }
        },

        PASSWORD_EDIT {
            @Override
            public String toString() { return "Register.Password.Edit"; }
        },

        SECURE_QUESTION_LIST {
            @Override
            public String toString() { return "Register.SecureQuestion.List"; }
        },

        SECURE_ANSWER_EDIT {
            @Override
            public String toString() { return "Register.SecureAnswer.Edit"; }
        },

        ZIP_CODE_EDIT {
            @Override
            public String toString() { return "Register.ZipCode.Edit"; }
        },

        EMAIL_SUBS_CHECKBOX {
            @Override
            public String toString() { return "Register.EmailSubscription.CheckBox"; }
        },

        SELECT_YOUR_STORE_LIST {
            @Override
            public String toString() { return "Register.SelectYourStore.List"; }
        },

        SEARCH_STORE_BUTTON {
            @Override
            public String toString() { return "Register.SearchStore.Button"; }
        },

        TERMS_ACCEPT_RADIOBUTTON {
            @Override
            public String toString() { return "Register.TermsAccept.RadioButton"; }
        },

        TERMS_AND_CONDITION_CHECKBOX {
            @Override
            public String toString() { return "Register.TermsAndCondition.Checkbox"; }
        },

        CONTINUE_BUTTON {
            @Override
            public String toString() { return "Register.Continue.Button"; }
        },

        CREATE_MY_ACCOUNT_BUTTON {
            @Override
            public String toString() { return "Register.CreateMyAccount.Button"; }
        }



    }

    public enum ContactInfoPage {
        TITLE_LIST {
            @Override
            public String toString() { return "ContactInfo.Title.List"; }
        },

        FIRST_NAME_EDIT {
            @Override
            public String toString() { return "ContactInfo.FirstName.Edit"; }
        },

        LAST_NAME_EDIT {
            @Override
            public String toString() { return "ContactInfo.LastName.Edit"; }
        },

        STREET_ADDRESS_EDIT {
            @Override
            public String toString() { return "ContactInfo.StreetAddress.Edit"; }
        },

        SUITE_APT_EDIT {
            @Override
            public String toString() { return "ContactInfo.SuiteApt.Edit"; }
        },

        REFERRAL_CODE_EDIT {
            @Override
            public String toString() { return "ContactInfo.ReferralCode.Edit"; }
        },

        UPDATE_LATER_BOTTOM_LINK {
            @Override
            public String toString() { return "ContactInfo.UpdateLaterBottom.Link"; }
        },

        SUBMIT_BUTTON {
            @Override
            public String toString() { return "ContactInfo.Submit.Button"; }
        }
    }

    public enum RegisterSuccessPage {
        REGISTER_SUCCESS_HEADER_WEBELEMENT {
            @Override
            public String toString() { return "RegisterSuccess.RegisterSuccessHeader.WebElement"; }
        },

        THANK_YOU_LABEL_WEBELEMENT {
            @Override
            public String toString() { return "RegisterSuccess.ThankYouLabel.WebElement"; }
        },

        CONTINUE_BUTTON {
            @Override
            public String toString() { return "RegisterSuccess.Continue.Button"; }
        }

    }

    public enum OurStoreMainPage {
        WEEKLY_SPECIALS_LINK {
            @Override
            public String toString() { return "OurStore.WeeklySpecials.Link"; }
        },

        CLUB_CARD_LINK {
            @Override
            public String toString() { return "OurStore.ClubCard.Link"; }
        },

        OUR_BRANDS_LINK {
            @Override
            public String toString() { return "OurStore.OurBrands.Link"; }
        },

        DELI_LINK {
            @Override
            public String toString() { return "OurStore.Deli.Link"; }
        }
    }

    public enum RecipesMealsMainPage {
        NAVIGATION_MENU_RECIPES_LINK {
            @Override
            public String toString() { return "RecipeMeals.NavigationMenuRecipes.Link"; }
        }

    }

    public enum PharmacyNutritionMainPage {
        PHARMACY_LINK {
            @Override
            public String toString() { return "PharmacyNutrition.Pharmacy.Link"; }
        },

        NUTRITION_LINK {
            @Override
            public String toString() { return "PharmacyNutrition.Nutrition.Link"; }
        },

        SIMPLE_NUTRITION_LINK {
            @Override
            public String toString() { return "PharmacyNutrition.SimpleNutrition.Link"; }
        },

        WELLNESS_CENTER_LINK {
            @Override
            public String toString() { return "PharmacyNutrition.WellnessCenter.Link"; }
        }
    }

    public enum J4UMainPage {

        COUPONS_DEALS_LINK {
            @Override
            public String toString() { return "J4U.CouponsDeals.Link"; }
        },

        YOUR_CLUB_SPECIALS_LINK {
            @Override
            public String toString() { return "J4U.YourClubSpecials.Link"; }
        },

        MY_CARD_LINK {
            @Override
            public String toString() { return "J4U.MyCard.Link"; }
        },

        MY_LIST_LINK {
            @Override
            public String toString() { return "J4U.MyList.Link"; }
        },

        RELATEDLINKS_COUPONSDEALS_LINK {
            @Override
            public String toString() { return "J4U.RelatedLinkCouponsDeals.Link"; }
        },

        RELATEDLINKS_YOURCLUBSPECIALS_LINK {
            @Override
            public String toString() { return "J4U.RelatedLinkYourClubSpecials.Link"; }
        },

        RELATEDLINKS_COUPONPOLICY_LINK {
            @Override
            public String toString() { return "J4U.RelatedLinkCouponPolicy.Link"; }
        },

        RELATEDLINKS_FAQ_LINK {
            @Override
            public String toString() { return "J4U.RelatedLinkFAQ.Link"; }
        },
        HEADER_GROCERY_DELIVERY_LINK {
            @Override
            public String toString() { return "J4U.HeaderGroceryDelivery.Link"; }
        },
        HEADER_GAS_REWARDS_LINK {
            @Override
            public String toString() { return "J4U.HeaderGasRewards.Link"; }
        },

        HEADER_GAS_REWARDS_COUNT_WEBELEMENT {
            @Override
            public String toString() { return "J4U.HeaderGasRewardsCount.WebElement"; }
        },

        HEADER_MY_CARD_LINK {
            @Override
            public String toString() { return "J4U.HeaderMyCard.Link"; }
        },

        HEADER_MY_CARD_COUNT_WEBELEMENT {
            @Override
            public String toString() { return "J4U.HeaderMyCardCount.WebElement"; }
        },

        HEADER_MY_LIST_LINK {
            @Override
            public String toString() { return "J4U.HeaderMyList.Link"; }
        },

        HEADER_MY_LIST_COUNT_WEBELEMENT {
            @Override
            public String toString() { return "J4U.HeaderMyListCount.WebElement"; }
        }

    }

    public enum CouponsDealsPage {

        IN_COUPONS_DEALS_LINK {
            @Override
            public String toString() { return "CouponsDeals.InCouponsDeals.Link"; }
        },

        CHANGE_PREFERENCE_LINK {
            @Override
            public String toString() { return "CouponsDeals.ChangePref.Link"; }
        },

        ADDITEMS_MYCARD_RADIOBUTTON {
            @Override
            public String toString() { return "CouponsDeals.AddItemsMyCard.RadioButton"; }
        },

        ADDITEMS_MYCARDMYLIST_RADIOBUTTON {
            @Override
            public String toString() { return "CouponsDeals.AddItemsMyCardMyList.RadioButton"; }
        },

        PREFERENCE_CANCEL_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.PreferenceCancel.Button"; }
        },

        PREFERENCE_SAVE_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.PreferenceSave.Button"; }
        },

        TOP_SORT_LIST {
            @Override
            public String toString() { return "CouponsDeals.TopSort.List"; }
        },

        TOP_FILTER_EDIT {
            @Override
            public String toString() { return "CouponsDeals.TopFilter.Edit"; }
        },

        SHOW_ALL_LINK {
            @Override
            public String toString() { return "CouponsDeals.ShowAll.Link"; }
        },

        SELECTED_SHOW_ALL_LINK {
            @Override
            public String toString() { return "CouponsDeals.SelectedShowAll.Link"; }
        },

        SPECIAL_OFFERS_LINK {
            @Override
            public String toString() { return "CouponsDeals.SpecialOffers.Link"; }
        },

        LEFTNAV_ITEM_LINK {
            @Override
            public String toString() { return "CouponsDeals.LeftNavItem.Link"; }
        },

        LEFTNAV_ITEM_EVENT_LINK {
            @Override
            public String toString() { return "CouponsDeals.LeftNavItemEvent.Link"; }
        },

        LEFTNAV_ITEM_CATEGORY_LINK {
            @Override
            public String toString() { return "CouponsDeals.LeftNavItemCategory.Link"; }
        },

        LEFTNAV_ITEM_OFFER_TYPE_LINK {
            @Override
            public String toString() { return "CouponsDeals.LeftNavItemOfferType.Link"; }
        },

        LEFTNAV_ALL_ITEMS_LINK {
            @Override
            public String toString() { return "CouponsDeals.LeftNavAllItems.Link"; }
        },

        SELECTED_LEFTNAV_ITEM_LINK {
            @Override
            public String toString() { return "CouponsDeals.SelectedLeftNavItem.Link"; }
        },

        ANY_SELECTED_LEFTNAV_ITEM_LINK {
            @Override
            public String toString() { return "CouponsDeals.AnySelectedLeftNavItem.Link"; }
        },

        HIDE_CATEGORIES_LINK {
            @Override
            public String toString() { return "CouponsDeals.HideCategories.Link"; }
        },
        HIDE_CATEGORIES_POSITION_LINK {
            @Override
            public String toString() { return "CouponsDeals.HiddenCategoriesPosition.Link"; }
        },

        HIDDEN_CATEGORIES_LINK {
            @Override
            public String toString() { return "CouponsDeals.HiddenCategories.Link"; }
        },

        HIDDEN_CATEGORY_ITEMS_LINK {
            @Override
            public String toString() { return "CouponsDeals.HiddenCategoryItems.Link"; }
        },

        HIDDEN_CATEGORY_ITEM_BY_NAME_LINK {
            @Override
            public String toString() { return "CouponsDeals.HiddenCategoryItemByName.Link"; }
        },

        HIDE_CATEGORIES_ALL_CHECKBOX {
            @Override
            public String toString() { return "CouponsDeals.HideCategoriesAllCheckboxes.CheckBox"; }
        },

        HIDE_CATEGORIES_CHECKBOX_BY_INDEX_CHECKBOX {
            @Override
            public String toString() { return "CouponsDeals.HideCategoriesCheckboxByIndex.CheckBox"; }
        },

        HIDE_ITEM_CHECKBOX {
            @Override
            public String toString() { return "CouponsDeals.HideItem.CheckBox"; }
        },

        HIDE_ITEM_BY_INDEX_CHECKBOX {
            @Override
            public String toString() { return "CouponsDeals.HideItemByIndex.CheckBox"; }
        },
        HIDE_CATEGORIES_DESELECT_ALL_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.HideCategoriesDeselectAll.Button"; }
        },
        HIDE_CATEGORIES_CLOSE_LINK {
            @Override
            public String toString() { return "CouponsDeals.HideCategoriesClose.Link"; }
        },
        HIDE_CATEGORIES_CANCEL_LINK {
            @Override
            public String toString() { return "CouponsDeals.HideCategoriesCancel.Link"; }
        },

        HIDE_CATEGORIES_SELECT_ALL_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.HideCategoriesSelectAll.Button"; }
        },

        HIDE_CATEGORIES_CANCEL_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.HideCategoriesCancel.Button"; }
        },

        HIDE_CATEGORIES_SAVE_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.HideCategoriesSave.Button"; }
        },
        HIDE_CATEGORIES_DESSELECTALL_MESSAGE_WEBLEMENT {
            @Override
            public String toString() { return "CouponsDeals.HideCategoriesDesselectAllMessage.Weblement"; }
        },
        HIDE_CATEGORIES_CATEGORY_SETTINGS_LINK {
            @Override
            public String toString() { return "CouponsDeals.HideCategorySettings.Link"; }
        },

        ITEMS_YOU_BUY_ADD_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyAddItem.Button"; }
        },

        ITEMS_YOU_BUY_ADD_BY_INDEX_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyAddItemByIndex.Button"; }
        },

        ITEMS_YOU_BUY_ADDED_BY_INDEX_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyAddedItemByIndex.Button"; }
        },

        ITEMS_YOU_BUY_ADDED_ITEM_TITLE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyAddedItemTitle.WebElement"; }
        },

        ITEMS_YOU_BUY_OFFER_PRICE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyOfferPrice.WebElement"; }
        },

        ITEMS_YOU_BUY_OFFER_DESCRIPTION_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyOfferDescription.WebElement"; }
        },

        ITEMS_YOU_BUY_OFFER_NAMES_LINK {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyOfferNames.Link"; }
        },

        ITEMS_YOU_BUY_OFFERS_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyOffers.WebElement"; }
        },

        ITEMS_YOU_BUY_OFFER_TYPE_EDIT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyOfferType.Edit"; }
        },

        ITEMS_YOU_BUY_STAR_ICON_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyStarIcon.WebElement"; }
        },

        ITEMS_YOU_BUY_OFFER_IMAGE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyOfferImage.WebElement"; }
        },

        ITEMS_YOU_BUY_EXPIRY_TYPE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyExpiryType.WebElement"; }
        },

        ITEMS_YOU_BUY_OFFER_TYPE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyOfferType.WebElement"; }
        },

        ITEMS_YOU_BUY_EXPIRATION_DATE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyExpirationDate.WebElement"; }
        },

        ITEMS_YOU_BUY_OFFER_TITLE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouBuyOfferTitle.WebElement"; }
        },

        ITEMS_YOU_LIKE_ADD_ITEM_BY_NAME_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikeAddItemByName.Button"; }
        },

        ITEMS_YOU_LIKE_ADDED_ITEM_TITLE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikeAddedItemTitle.WebElement"; }
        },

        ITEMS_YOU_LIKE_ADD_BY_INDEX_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikeAddItemByIndex.Button"; }
        },

        ITEMS_YOU_LIKE_ADDED_BY_INDEX_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikeAddedItemByIndex.Button"; }
        },

        ITEMS_YOU_LIKE_OFFER_IMAGE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikeOfferImage.WebElement"; }
        },

        ITEMS_YOU_LIKE_PERSONALIZED_PRICE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikePersonalizedPrice.WebElement"; }
        },

        ITEMS_YOU_LIKE_OFFER_PRICE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikeOfferPrice.WebElement"; }
        },

        ITEMS_DISPLAYED_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsDisplayed.WebElement"; }
        },

        VIEW_BY_CATEGORY_LINK {
            @Override
            public String toString() { return "CouponsDeals.ViewByCategoryExpanded.Link"; }
        },

        VIEW_BY_CATEGORY_COLLAPSED_LINK {
            @Override
            public String toString() { return "CouponsDeals.ViewByCategoryCollapsed.Link"; }
        },

        VIEW_BY_EVENT_EXPANDED_LINK {
            @Override
            public String toString() { return "CouponsDeals.ViewByEventExpanded.Link"; }
        },

        VIEW_BY_EVENT_COLLAPSED_LINK {
            @Override
            public String toString() { return "CouponsDeals.ViewByEventCollapsed.Link"; }
        },

        VIEW_BY_OFFER_TYPE_LINK {
            @Override
            public String toString() { return "CouponsDeals.ViewByOfferType.Link"; }
        },

        BACK_TO_TOP_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.BackToTop.Button"; }
        },

        BACK_TO_TOP_BACKGROUND_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.BackToTopBackground.Button"; }
        },

        ITEMS_YOU_LIKE_OFFER_NAMES_LINK {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikeOfferByIndex.Link"; }
        },

        ITEMS_YOU_LIKE_OFFERS_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikeOffers.WebElement"; }
        },

        SECTION_HEADER_NAME_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.SectionHeaderName.WebElement"; }
        },

        CLEAR_FILTER_LINK {
            @Override
            public String toString() { return "CouponsDeals.ClearFilter.Link"; }
        },

        NO_RESULTS_ERROR_FILTER_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.NoResultsErrorFilter.WebElement"; }
        },

        BUSY_LOAD_SPINNER_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.BusyLoadSpinner.WebElement"; }
        },

        GET_STARTED_POPUP_CLOSE_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.GetStartedPopupClose.Button"; }
        },

        ITEMS_YOU_LIKE_ADD_ITEM_BY_INDEX_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikeAddItemByIndex.Button"; }
        },

        ITEMS_YOU_LIKE_ITEM_TITLE_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikeItemTitleByIndex.WebElement"; }
        },

        ITEMS_YOU_LIKE_ITEM_TITLE_BY_NAME_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikeOfferByName.Link"; }
        },

        ITEMS_YOU_LIKE_SAVINGS_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ItemsYouLikeSavings.WebElement"; }
        },

        SESSION_TIMEOUT_ERROR_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.SessionTimeOutError.WebElement"; }
        },

        SESSION_TIMEOUT_PLEASE_SIGN_IN_LINK {
            @Override
            public String toString() { return "CouponsDeals.SessionTimeOutPleaseSignIn.Link"; }
        },

        BOXTOP_DO_NOT_SHOW_AGAIN_LINK {
            @Override
            public String toString() { return "CouponsDeals.BoxTopDoNotShowAgain.Link"; }
        },

        BOXTOP_ENROLL_NOW_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.BoxTopEnrollNow.Button"; }
        },

        BOXTOP_CLOSE_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.BoxTopClose.Button"; }
        },

        BOXTOP_MESSAGE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.BoxTopMessage.WebElement"; }
        },

        SMALL_POD_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.SmallPod.WebElement"; }
        },

        OFFER_NAME_LINK {
            @Override
            public String toString() { return "CouponsDeals.OfferName.Link"; }
        },


        OFFER_DESCRIPTION_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.OfferDescription.WebElement"; }
        },

        CLIPPED_OFFER_NAME_LINK {
            @Override
            public String toString() { return "CouponsDeals.ClippedOfferName.Link"; }
        },

        RL_COUPONS_DEALS_LINK {
            @Override
            public String toString() { return "CouponsDeals.RLCouponsDeals.Link"; }
        },

        RL_YOUR_CLUB_SPECIALS_LINK {
            @Override
            public String toString() { return "CouponsDeals.RLYourClubSpecials.Link"; }
        },

        RL_COUPON_POLICY_LINK {
            @Override
            public String toString() { return "CouponsDeals.RLCouponPolicy.Link"; }
        },

        RL_FAQ_LINK {
            @Override
            public String toString() { return "CouponsDeals.RLFAQ.Link"; }
        },

        POPUP_DISCLAIMER_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.PopupDisclaimer.WebElement"; }
        },

        GENERIC_YCS_POD_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.GenericYCSPod.Link"; }
        },

        POPUP_OFFER_IMAGE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.PopUpOfferImage.WebElement"; }
        },

        POPUP_OFFER_PRICE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.PopUpOfferPrice.WebElement"; }
        },

        POPUP_OFFER_DESCRIPTION_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.PopUpOfferDescription.WebElement"; }
        },

        POPUP_OFFER_TYPE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.PopUpOfferType.WebElement"; }
        },

        POPUP_OFFER_EXPIRATION_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.PopUpOfferExpiration.WebElement"; }
        },

        POPUP_ADDED_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.PopUpAdded.Button"; }
        },

        POPUP_ADD_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.PopUpAdd.Button"; }
        },

        POPUP_J4U_LOGO_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.PopUpJ4ULogo.WebElement"; }
        },

        POPUP_PERSONALIZED_PRICE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.PopUpPersonalizedPrice.WebElement"; }
        },

        YCS_GENERIC_POD_VIEW_BUTTON {
            @Override
            public String toString() { return "CouponsDeals.YCSGenericPodView.Button"; }
        },

        CHANGE_PREFERENCE_DEFAULT_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ChangePreferenceLabel.WebElement"; }
        },


        NO_SEARCH_RESULT_CATEGORY_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.NoSearchResultCategory.WebElement"; }
        },

        DISCLAIMER_TEXT_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.DisclaimerText.WebElement"; }
        },

        CATEGORY_NORESULT_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.CategoryNoResult.WebElement"; }
        },

        HIDDEN_AND_ACTIVE_CATEGORY_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.HiddenAndActiveCategory.WebElement"; }
        },

        HIDDEN_AND_ACTIVE_CLICKABLE_CATEGORY_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.ClickableCategory.WebElement"; }
        },

        WE_CANNOT_SAVE_YOUR_PREFERENCE_ERROR_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.WeCannotSaveYourPreferenceError.WebElement"; }
        },

        PRINT_EMAIL_HINT_ICON_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.PrintEmailHintIcon.WebElement"; }
        },

        VIEW_MY_LIST_HINT_ICON_LINK {
            @Override
            public String toString() { return "CouponsDeals.ViewMyListHintIcon.Link"; }
        },

        RELATED_LINKS_SECTION_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.RelatedLinksSection.WebElement"; }
        },

        RELATED_LINKS_LABEL_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.RelatedLinksLabel.WebElement"; }
        },

        RELATED_LINKS_SECTION_BACKGROUND_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.RelatedLinksSectionBackground.WebElement"; }
        },

        RL_SEPARATOR_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.RLSeparatorByIndex.WebElement"; }
        },

        RL_SPACE_HEIGHT_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.RLSpaceHeightByIndex.WebElement"; }
        },

        RL_PADDING_BOTTOM_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.RLPaddingBottom.WebElement"; }
        },

        X_MASK_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.XMask.WebElement"; }
        },

        X_MASK_BOXTOP_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.XMaskBoxtop.WebElement"; }
        },

        ITEMS_YOU_BUY_POPUP_SMALL_STAR_ICON_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.PopUpSmallStarItemYouBuy.WebElement"; }
        },

        POPUP_OFFER_DETAILS_IF_DISCLAIMER_EXIST_EDIT {
            @Override
            public String toString() { return "CouponsDeals.PopUpOfferDetailsIfDisclaimerExist.Edit"; }
        },

        POPUP_OFFER_TITLE_WEBELEMENT {
            @Override
            public String toString() { return "CouponsDeals.PopUpOfferTitle.WebElement"; }
        },

    }



    public enum YourClubSpecialsPage {
        OFFERS_ADDED_LINK {
            @Override
            public String toString() { return "YCS.OffersAdded.Link"; }
        },

        SHOW_ALL_LINK {
            @Override
            public String toString() { return "YCS.ShowAll.Link"; }
        },

        HIDE_CATEGORIES_LINK {
            @Override
            public String toString() { return "YCS.HideCategories.Link"; }
        },

        HIDDEN_CATEGORIES_LINK {
            @Override
            public String toString() { return "YCS.HiddenCategories.Link"; }
        },

        HIDDEN_CATEGORY_ITEMS_BY_INDEX_LINK {
            @Override
            public String toString() { return "YCS.HiddenCategoryItemsByIndex.Link"; }
        },

        HIDDEN_CATEGORY_ALL_ITEM_LINK {
            @Override
            public String toString() { return "YCS.HiddenCategoryItem.Link"; }
        },

        HIDDEN_CATEGORY_ITEMS_BY_NAME_LINK {
            @Override
            public String toString() { return "YCS.HiddenCategoryItemsByName.Link"; }
        },

        HIDE_CATEGORIES_ALL_CHECKBOX {
            @Override
            public String toString() { return "YCS.HideCategoriesAllCheckboxes.CheckBox"; }
        },

        HIDE_ITEM_CHECKBOX {
            @Override
            public String toString() { return "YCS.HideItem.CheckBox"; }
        },

        HIDE_CATEGORIES_DESELECT_ALL_BUTTON {
            @Override
            public String toString() { return "YCS.HideCategoriesDeselectAll.Button"; }
        },

        HIDE_CATEGORIES_SELECT_ALL_BUTTON {
            @Override
            public String toString() { return "YCS.HideCategoriesSelectAll.Button"; }
        },

        HIDE_CATEGORIES_CANCEL_BUTTON {
            @Override
            public String toString() { return "YCS.HideCategoriesCancel.Button"; }
        },

        HIDE_CATEGORIES_DESSELECTALL_MESSAGE_WEBELEMENT {
            @Override
            public String toString() { return "YCS.HideCategoriesDesselectAllMessage.Weblement"; }
        },
        HIDE_CATEGORIES_CLOSE_LINK {
            @Override
            public String toString() { return "YCS.HideCategoriesClose.Link"; }
        },
        HIDE_CATEGORIES_SAVE_BUTTON {
            @Override
            public String toString() { return "YCS.HideCategoriesSave.Button"; }
        },
        HIDE_CATEGORIES_SETTINGS_LINK {
            @Override
            public String toString() { return "YCS.HideCategorySettings.Link"; }
        },

        LEFTNAV_ITEM_LINK {
            @Override
            public String toString() { return "YCS.LeftNavItem.Link"; }
        },

        VIEW_BY_CATEGORY_LINK {
            @Override
            public String toString() { return "YCS.ViewByCategory.Link"; }
        },

        IN_YOUR_CLUB_SPECIALS_LINK {
            @Override
            public String toString() { return "YCS.InYourClubSpecials.Link"; }
        },

        TOP_SORT_LIST {
            @Override
            public String toString() { return "YCS.TopSort.List"; }
        },

        TOP_FILTER_EDIT {
            @Override
            public String toString() { return "YCS.TopFilter.Edit"; }
        },
        CLEAR_FILTER_LINK {
            @Override
            public String toString() { return "YCS.ClearFilter.Link"; }
        },
        TOP_TEN_ADD_TO_LIST_BUTTON {
            @Override
            public String toString() { return "YCS.TopTenAddToList.Button"; }
        },

        PRODUCT_LIST_ADD_TO_LIST_BUTTON {
            @Override
            public String toString() { return "YCS.ProductListAddToList.Button"; }
        },

        PRODUCT_LIST_ADD_TO_LIST_BY_INDEX_BUTTON {
            @Override
            public String toString() { return "YCS.ProductListAddToListByIndex.Button"; }
        },

        PRODUCT_LIST_ADDED_TO_LIST_BY_INDEX_BUTTON {
            @Override
            public String toString() { return "YCS.ProductListAddedToListByIndex.Button"; }
        },

        PRODUCT_LIST_ITEM_NAME_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "YCS.ProductListItemNameByIndex.WebElement"; }
        },

        CLIPPED_ITEM_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "YCS.ProductListClippedItemByIndex.WebElement"; }
        },

        SESSION_TIMEOUT_ERROR_WEBELEMENT {
            @Override
            public String toString() { return "YCS.SessionTimeOutError.WebElement"; }
        },

        SESSION_TIMEOUT_PLEASE_SIGN_IN_LINK {
            @Override
            public String toString() { return "YCS.SessionTimeOutPleaseSignIn.Link"; }
        },

        TOP_TEN_OFFERS_POD_WEBELEMENT {
            @Override
            public String toString() { return "YCS.TopTenOffersPod.WebElement"; }
        },

        TOP_TEN_ADD_TO_LIST_BY_MULTIPLE_BUTTON {
            @Override
            public String toString() { return "YCS.TopTenAddToListByMultiple.Button"; }
        },

        TOP_TEN_OFFER_DESCRIPTION_LINK {
            @Override
            public String toString() { return "YCS.TopTenOfferDescription.Link"; }
        },

        DISCLAIMER_WEBELEMENT {
            @Override
            public String toString() { return "YCS.Disclaimer.WebElement"; }
        },

        PAGINATION_LINK {
            @Override
            public String toString() { return "YCS.Pagination.Link"; }
        },

        OFFER_DESCRIPTION_LINK {
            @Override
            public String toString() { return "YCS.OfferDescription.Link"; }
        },

        TABLE_ROWS_WEBELEMENT {
            @Override
            public String toString() { return "YCS.TableRows.WebElement"; }
        },

        ADD_ALL_TO_MY_LIST_LINK {
            @Override
            public String toString() { return "YCS.AddAllToMyList.Link"; }
        },

        SAVINGS_VALUE_RADIOBUTTON {
            @Override
            public String toString() { return "YCS.SavingsValue.RadioButton"; }
        },

        FREQUENTLY_PURCHASED_RADIOBUTTON {
            @Override
            public String toString() { return "YCS.FrequentlyPurchased.RadioButton"; }
        },

        RL_COUPONS_DEALS_LINK {
            @Override
            public String toString() { return "YCS.RLCouponsDeals.Link"; }
        },

        RL_YOUR_CLUB_SPECIALS_LINK {
            @Override
            public String toString() { return "YCS.RLYourClubSpecials.Link"; }
        },

        RL_COUPON_POLICY_LINK {
            @Override
            public String toString() { return "YCS.RLCouponPolicy.Link"; }
        },

        RL_FAQ_LINK {
            @Override
            public String toString() { return "YCS.RLFAQ.Link"; }
        },

        COMING_SOON_BODY_WEBELEMENT {
            @Override
            public String toString() { return "YCS.ComingSoonBody.WebElement"; }
        },

        COMING_SOON_LINK {
            @Override
            public String toString() { return "YCS.ComingSoon.Link"; }
        },

        FILTER_RESULT_TITLE {
            @Override
            public String toString() { return "YCS.FilterResultsTitle.WebElement"; }
        },

        NO_RESULT_FILTER {
            @Override
            public String toString() { return "YCS.NoFilterResult.WebElement"; }
        },

        SELECTED_LEFT_NAV_LINK {
            @Override
            public String toString() { return "YCS.SelectedLeftNav.Link"; }
        },

        LEFTNAV_ITEM_CATEGORY_LINK {
            @Override
            public String toString() { return "YCS.LeftNavItemCategory.Link"; }
        },
        CATEGORY_NO_RESULT {
            @Override
            public String toString() { return "YCS.CategoryNoResult.WebElement"; }
        },

        SELECTED_LEFT_NAV_BY_NAME_LINK {
            @Override
            public String toString() { return "YCS.SelectedLeftNavByName.Link"; }
        },
        HIDDEN_AND_ACTIVE_CATEGORY_WEBELEMENT {
            @Override
            public String toString() { return "YCS.HiddenAndActiveCategory.WebElement"; }
        },

        CLICKABLE_CATEGORY_WEBELEMENT {
            @Override
            public String toString() { return "YCS.ClickableCategory.WebElement"; }
        },

        SELECT_ITEMS_PER_PAGE_DROPDOWN_WEBELEMENT {
            @Override
            public String toString() { return "YCS.SelectItemsPerPageDropdown.WebElement"; }
        },

        ADD_TO_LIST_BUTTON_ALL {
            @Override
            public String toString() { return "YCS.AddToListButtonAll"; }
        },


        WE_CANNOT_SAVE_YOUR_PREFERENCE_ERROR_WEBELEMENT {
            @Override
            public String toString() { return "YCS.WeCannotSaveYourPreferenceError.WebElement"; }
        },

        EXPIRATION_DATE_WEBELEMENT {
            @Override
            public String toString() { return "YCS.ExpirationDate.Webelement"; }
        },

        SORTBY_CATEGORY_NAME_HEADER_WEBELEMENT {
            @Override
            public String toString() { return "YCS.SortByCategoryNameHeader.Webelement"; }
        },

        STAR_ICON_IMAGE_WEBELEMENT {
            @Override
            public String toString() { return "YCS.StarIconImage.Webelement"; }
        },

        PAGINATION_SELECTED_LINK {
            @Override
            public String toString() { return "YCS.PaginationSelected.Link"; }
        },

        PAGINATION_NEXT_ENABLED_BUTTON {
            @Override
            public String toString() { return "YCS.PaginationNextEnabled.Button"; }
        },
        PAGINATION_NEXT_DISABLED_BUTTON {
            @Override
            public String toString() { return "YCS.PaginationNextDisabled.Button"; }
        },

        PAGINATION_PREV_ENABLED_BUTTON {
            @Override
            public String toString() { return "YCS.PaginationPreviousEnabled.Button"; }
        },

        PAGINATION_PREV_DISABLED_BUTTON {
            @Override
            public String toString() { return "YCS.PaginationPreviousDisabled.Button"; }
        },

        PAGINATION_BY_INDEX_LINK {
            @Override
            public String toString() { return "YCS.PaginationByIndex.Link"; }
        },

        LEFT_NAV_BLANKSPACE_WEBELEMENT {
            @Override
            public String toString() { return "YCS.LeftNavBlankSpace.Webelement"; }
        },

        PRINT_EMAIL_HINT_ICON_WEBELEMENT {
            @Override
            public String toString() { return "YCS.PrintEmailHintIcon.WebElement"; }
        },

        VIEW_MY_LIST_HINT_ICON_LINK {
            @Override
            public String toString() { return "YCS.ViewMyListHintIcon.Link"; }
        },


        HIDE_CATEGORIES_CHECKBOX_BY_INDEX_CHECKBOX {
            @Override
            public String toString() { return "YCS.HideCategoriesCheckboxByIndex.CheckBox"; }
        },

        HIDE_CATEGORIES_CHECKBOX_BY_NAME_CHECKBOX {
            @Override
            public String toString() { return "YCS.HideCategoriesCheckboxByName.CheckBox"; }
        },

        RELATED_LINKS_SECTION_WEBELEMENT {
            @Override
            public String toString() { return "YCS.RelatedLinksSection.WebElement"; }
        },

        RELATED_LINKS_LABEL_WEBELEMENT {
            @Override
            public String toString() { return "YCS.RelatedLinksLabel.WebElement"; }
        },

        RELATED_LINKS_SECTION_BACKGROUND_WEBELEMENT {
            @Override
            public String toString() { return "YCS.RelatedLinksSectionBackground.WebElement"; }
        },

        RL_SEPARATOR_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "YCS.RLSeparatorByIndex.WebElement"; }
        },

        RL_SPACE_HEIGHT_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "YCS.RLSpaceHeightByIndex.WebElement"; }
        },

        RL_PADDING_BOTTOM_WEBELEMENT {
            @Override
            public String toString() { return "YCS.RLPaddingBottom.WebElement"; }
        },


        X_MASK_WEBELEMENT {
            @Override
            public String toString() { return "YCS.XMask.WebElement"; }
        },






    }




//    public enum MyCardPage {
//        IN_MY_CARD_LINK {
//            @Override
//            public String toString() { return "MyCard.InMyCard.Link"; }
//        },
//
//        VIEW_ACTIVE_OFFERS_LINK {
//            @Override
//            public String toString() { return "MyCard.ViewActiveOffers.Link"; }
//        },
//
//        VIEW_REDEEMED_OFFERS_LINK {
//            @Override
//            public String toString() { return "MyCard.ViewRedeemedOffers.Link"; }
//        },
//
//        VIEW_EXPIRED_OFFERS_LINK {
//            @Override
//            public String toString() { return "MyCard.ViewExpiredOffers.Link"; }
//        },
//
//        SHOW_ALL_LINK {
//            @Override
//            public String toString() { return "MyCard.ShowAll.Link"; }
//        },
//
//        LEFTNAV_ITEM_BY_NAME_LINK {
//            @Override
//            public String toString() { return "MyCard.LeftNavItem.Link"; }
//        },
//
//        ADD_TO_LIST_BUTTON {
//            @Override
//            public String toString() { return "MyCard.AddToList.Button"; }
//        },
//
//        ADD_ALL_OFFERS_TO_MY_LIST_BUTTON {
//            @Override
//            public String toString() { return "MyCard.AddAllOffersToMyList.Button"; }
//        },
//
//        BACK_TO_TOP_BUTTON {
//            @Override
//            public String toString() { return "MyCard.BackToTop.Button"; }
//        },
//
//        WHY_LINK {
//            @Override
//            public String toString() { return "MyCard.Why.Link"; }
//        },
//
//        WHY_POPUP_TEXT_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.WhyPopupText.WebElement"; }
//        },
//
//        WHY_POPUP_OK_BUTTON {
//            @Override
//            public String toString() { return "MyCard.WhyPopupOK.Button"; }
//        },
//
//        TOP_SORT_LIST {
//            @Override
//            public String toString() { return "MyCard.TopSort.List"; }
//        },
//
//        DISCLAIMER_TEXT_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.DisclaimerText.WebElement"; }
//        },
//
//        OFFER_ROWS_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.OfferRows.WebElement"; }
//        },
//
//        OFFER_TITLE_BY_INDEX_LINK {
//            @Override
//            public String toString() { return "MyCard.OfferTitleByIndex.Link"; }
//        },
//
//        OFFER_SUMMARY_BY_INDEX_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.OfferSummaryByIndex.WebElement"; }
//        },
//
//        OFFER_DESCRIPTION_BY_INDEX_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.OfferDescriptionByIndex.WebElement"; }
//        },
//
//        ADD_TO_LIST_BY_INDEX_BUTTON {
//            @Override
//            public String toString() { return "MyCard.AddToListbyIndex.Button"; }
//        },
//
//        TOTAL_OFFERS_ADDED_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.TotalOffersAdded.WebElement"; }
//        },
//
//        OFFER_NAME_AND_DESCRIPTION_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.OfferNameAndDescription.WebElement"; }
//        },
//        SESSION_TIMEOUT_ERROR_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.SessionTimeOutError.WebElement"; }
//        },
//
//        SESSION_TIMEOUT_PLEASE_SIGN_IN_LINK {
//            @Override
//            public String toString() { return "MyCard.SessionTimeOutPleaseSignIn.Link"; }
//        },
//
//        BOXTOP_DO_NOT_SHOW_AGAIN_LINK {
//            @Override
//            public String toString() { return "MyCard.BoxTopDoNotShowAgain.Link"; }
//        },
//
//        BOXTOP_ENROLL_NOW_BUTTON {
//            @Override
//            public String toString() { return "MyCard.BoxTopEnrollNow.Button"; }
//        },
//
//        ANY_SELECTED_LEFTNAV_ITEM_LINK {
//            @Override
//            public String toString() { return "MyCard.AnySelectedLeftNavItem.Link"; }
//        },
//
//        ITEMS_DISPLAYED_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.ItemsDisplayed.WebElement"; }
//        },
//
//        LEFTNAV_CATEGORIES_BY_INDEX_LINK {
//            @Override
//            public String toString() { return "MyCard.LeftNavCategoriesByIndex.Link"; }
//        },
//
//        LEFTNAV_ALL_ITEMS_BY_INDEX_LINK {
//            @Override
//            public String toString() { return "MyCard.LeftNavAllItemsByIndex.Link"; }
//        },
//
//        SAVINGS_SECTION_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.SavingsSection.WebElement"; }
//        },
//
//        REWARDS_SECTION_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RewardsSection.WebElement"; }
//        },
//
//        OFFER_TYPE_COLUMN_HEADER_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.OfferTypeColumnHeader.WebElement"; }
//        },
//
//
//        OFFER_TYPE_BIG_POD_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.OfferTypeBigPod.WebElement"; }
//        },
//
//        POD_CLOSE_BUTTON {
//            @Override
//            public String toString() { return "MyCard.PodClose.Button"; }
//        },
//
//        BUILD_YOUR_SHOPPING_LIST_BANNER_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.BuildYourShoppingListBanner.WebElement"; }
//        },
//
//        HINT_ICON_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.HintIcon.WebElement"; }
//        },
//
//        OFFERS_LIST_WEBTABLE {
//            @Override
//            public String toString() { return "MyCard.OffersList.WebTable"; }
//        },
//
//        VIEW_ACTIVE_OFFERS_SECTION_LINK {
//            @Override
//            public String toString() { return "MyCard.ViewActiveOffersSection.Link"; }
//        },
//
//        VIEW_REDEEMED_OFFERS_SECTION_LINK {
//            @Override
//            public String toString() { return "MyCard.ViewRedeemedOffersSection.Link"; }
//        },
//
//        VIEW_EXPIRED_OFFERS_SECTION_LINK {
//            @Override
//            public String toString() { return "MyCard.ViewExpiredOffersSection.Link"; }
//        },
//
//        OFFER_IMAGE_BY_INDEX_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.OfferImageByIndex.WebElement"; }
//        },
//
//        OFFER_PRICE_BY_INDEX_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.OfferPriceByIndex.WebElement"; }
//        },
//
//        OFFER_TYPE_BY_INDEX_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.OfferTypeByIndex.WebElement"; }
//        },
//
//        OFFER_EXPIRATION_BY_INDEX_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.OfferExpirationByIndex.WebElement"; }
//        },
//
//        ADDED_TO_LIST_BY_INDEX_BUTTON {
//            @Override
//            public String toString() { return "MyCard.AddedToListByIndex.Button"; }
//        },
//
//        POPUP_OFFER_IMAGE_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.PopUpOfferImage.WebElement"; }
//        },
//
//        POPUP_OFFER_PRICE_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.PopUpOfferPrice.WebElement"; }
//        },
//
//        POPUP_OFFER_DESCRIPTION_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.PopUpOfferDescription.WebElement"; }
//        },
//
//        POPUP_OFFER_TYPE_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.PopUpOfferType.WebElement"; }
//        },
//
//        POPUP_OFFER_EXPIRATION_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.PopUpOfferExpiration.WebElement"; }
//        },
//
//        POPUP_OFFER_ADD_BUTTON {
//            @Override
//            public String toString() { return "MyCard.PopUpAdd.Button"; }
//        },
//
//        POPUP_J4U_LOGO_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.PopUpJ4ULogo.WebElement"; }
//        },
//
//        POPUP_DISCLAIMER_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.PopUpDisclaimer.WebElement"; }
//        },
//
//        POPUP_PERSONALIZED_PRICE_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.PopUpPersonalizedPrice.WebElement"; }
//        },
//
//        POPUP_COMPETITOR_PRICE_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.PopUpCompetitorPrice.WebElement"; }
//        },
//
//        POPUP_OFFER_ADDED_BUTTON {
//            @Override
//            public String toString() { return "MyCard.PopUpAdded.Button"; }
//        },
//
//        POPUP_OFFER_REDEEMED_BUTTON {
//            @Override
//            public String toString() { return "MyCard.PopUpRedeemed.Button"; }
//        },
//
//        POPUP_OFFER_EXPIRED_BUTTON {
//            @Override
//            public String toString() { return "MyCard.PopUpExpired.Button"; }
//        },
//
//        REDEEMED_OFFERS_HEADER_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RedeemedOffersHeader.WebElement"; }
//        },
//
//        REDEEMED_OFFER_TYPE1_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RedeemedOfferType1.WebElement"; }
//        },
//
//        REDEEMED_OFFER_TYPE2_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RedeemedOfferType2.WebElement"; }
//        },
//
//        REDEEMED_OFFER_PRICE_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RedeemedOfferPrice.WebElement"; }
//        },
//
//        REDEEMED_OFFER_EXPIRATION_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RedeemedOfferExpiration.WebElement"; }
//        },
//
//        REDEEMED_OFFER_QUANTITY_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RedeemedOfferQuantity.WebElement"; }
//        },
//
//        REDEMPTION_HISTORY_DATE_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RedemptionHistoryDate.WebElement"; }
//        },
//
//        REDEMPTION_HISTORY_LOCATION_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RedemptionHistoryLocation.WebElement"; }
//        },
//
//        REDEMPTION_HISTORY_QUANTITY_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RedemptionHistoryQuantity.WebElement"; }
//        },
//
//        EXPIRED_OFFERS_HEADER_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.ExpiredOffersHeader.WebElement"; }
//        },
//
//
//        EXPIRED_OFFERS_PRICE_BY_INDEX_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.ExpiredOfferPriceByIndex.WebElement"; }
//        },
//
//        EXPIRED_OFFERS_TYPE_BY_INDEX_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.ExpiredOfferType1ByIndex.WebElement"; }
//        },
//
//        EXPIRED_OFFERS_TYPE2_BY_INDEX_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.ExpiredOfferType2ByIndex.WebElement"; }
//        },
//
//        ADD_TO_LIST_BUTTON_ALL {
//            @Override
//            public String toString() { return "MyCard.AddToListButtonAll"; }
//        },
//
//        NO_OFFERS_LOADED_MESSAGE_WEBELEMENT{
//            @Override
//            public String toString() { return "MyCard.NoOffersLoadedMessage.WebElement"; }
//        },
//
//        NO_OFFERS_LOADED_MESSAGE_CD_LINK{
//            @Override
//            public String toString() { return "MyCard.NoOffersLoadedMessageCouponsAndDeals.Link"; }
//        },
//
//        NO_REDEEMED_OFFERS_MESSAGE_WEBLEMENT{
//            @Override
//            public String toString() { return "MyCard.NoRedeemedOffersMessage.WebElemet"; }
//        },
//
//        NO_EXPIRED_OFFERS_MESSAGE_WEBLEMENT{
//            @Override
//            public String toString() { return "MyCard.NoExpiredOffersMessage.WebElemet"; }
//        },
//
//        BIG_POD_ADD_BUTTON{
//            @Override
//            public String toString() { return "MyCard.BigPODAdd.Button"; }
//        },
//
//        BIG_POD_CLOSE_BUTTON{
//            @Override
//            public String toString() { return "MyCard.BigPODClose.Button"; }
//        },
//
//        LEFTNAV_ALL_ITEMS_BY_NAME_LINK {
//            @Override
//            public String toString() { return "MyCard.LeftNavAllItems.Link"; }
//        },
//
//        RELATED_LINKS_SECTION_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RelatedLinksSection.WebElement"; }
//        },
//
//        RELATED_LINKS_LABEL_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RelatedLinksLabel.WebElement"; }
//        },
//
//        RELATED_LINKS_SECTION_BACKGROUND_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RelatedLinksSectionBackground.WebElement"; }
//        },
//
//        RL_SEPARATOR_BY_INDEX_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RLSeparatorByIndex.WebElement"; }
//        },
//
//        RL_SPACE_HEIGHT_BY_INDEX_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RLSpaceHeightByIndex.WebElement"; }
//        },
//
//        RL_PADDING_BOTTOM_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.RLPaddingBottom.WebElement"; }
//        },
//
//        RL_COUPONS_DEALS_LINK {
//            @Override
//            public String toString() { return "MyCard.RLCouponsDeals.Link"; }
//        },
//
//        X_MASK_WEBELEMENT {
//            @Override
//            public String toString() { return "MyCard.XMask.WebElement"; }
//        },
//
//    }

    public enum MyListPage {

        IN_MY_LIST_LINK {
            @Override
            public String toString() { return "MyList.InMyList.Link"; }
        },

        PRINT_MY_LIST_LINK {
            @Override
            public String toString() { return "MyList.PrintMyList.Link"; }
        },

        PRINT_INCLUDE_IMAGE_YES_BUTTON {
            @Override
            public String toString() { return "MyList.PrintIncludeImageYes.Button"; }
        },

        PRINT_INCLUDE_IMAGE_NO_BUTTON {
            @Override
            public String toString() { return "MyList.PrintIncludeImageNo.Button"; }
        },

        EMAIL_MY_LIST_LINK {
            @Override
            public String toString() { return "MyList.EmailMyList.Link"; }
        },

        EMAIL_MY_LIST_EMAIL_EDIT {
            @Override
            public String toString() { return "MyList.EmailMyListEmail.Edit"; }
        },

        EMAIL_MY_LIST_SEND_BUTTON {
            @Override
            public String toString() { return "MyList.EmailMyListSend.Button"; }
        },

        EMAIL_MY_LIST_CONFIRM_OK_MESSAGE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.EmailMyListConfirmOKMessage.WebElement"; }
        },

        EMAIL_MY_LIST_BACK_TO_MY_LIST_BUTTON {
            @Override
            public String toString() { return "MyList.EmailMyListBackToMyList.Button"; }
        },
        EMAIL_MY_LIST_SEND_POPUP_WINDOW {
            @Override
            public String toString() { return "MyList.EmailMyListSendPopUp.WebElement"; }
        },
        EMAIL_MY_LIST_INVALIDEMAIL_POPUP_WINDOW {
            @Override
            public String toString() { return "MyList.EmailMyListInvalidEmailPopUp.Webelement"; }
        },
        EMAIL_MY_LIST_INVALIDEMAIL_MESSAGE {
            @Override
            public String toString() { return "MyList.EmailMyListInvalidEmailPopUpMessage.Webelement"; }
        },

        EMAIL_MY_LIST_CONFIRMATION_ICON_WEBELEMENT {
            @Override
            public String toString() { return "MyList.EmailMyListConfirmationIcon.WebElement"; }
        },

        ADD_MY_OWN_ITEMS_LINK {
            @Override
            public String toString() { return "MyList.AddMyOwnItems.Link"; }
        },

        MY_LIST_LINK {
            @Override
            public String toString() { return "MyList.MyList.Link"; }
        },

        PURCHASE_HISTORY_LINK {
            @Override
            public String toString() { return "MyList.PurchaseHistory.Link"; }
        },

        SHOW_ALL_LINK {
            @Override
            public String toString() { return "MyList.ShowAll.Link"; }
        },

        PURCHASE_HISTORY_SHOW_ALL_LINK {
            @Override
            public String toString() { return "MyList.PurchaseHistoryShowAll.Link"; }
        },

        TOP_SORT_LIST {
            @Override
            public String toString() { return "MyList.TopSort.List"; }
        },

        SORT_CATEGORY_HEADER_TITLE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.SortCategoryHeaderTitle.WebElement"; }
        },

        SORT_CATEGORY_HEADER_TITLE_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "MyList.SortCategoryHeaderTitleByIndex.WebElement"; }
        },



        ITEM_SELECT_CHECKBOX {
            @Override
            public String toString() { return "MyList.ItemSelect.CheckBox"; }
        },

        ITEM_SELECT_BY_INDEX_CHECKBOX {
            @Override
            public String toString() { return "MyList.ItemSelectByIndex.Checkbox"; }
        },


        ITEM_REMOVE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.ItemRemove.WebElement"; }
        },

        MY_LIST_OFFER_AVAILABLE_LINK {
            @Override
            public String toString() { return "MyList.MyListOfferAvailable.Link"; }
        },

        PHPL_OFFER_AVAILABLE_LINK {
            @Override
            public String toString() { return "MyList.PHPLOfferAvailable.Link"; }
        },

        POPUP_WINDOW_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PopupWindow.WebElement"; }
        },

        POPUP_DISCLAIMER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PopupDisclaimer.WebElement"; }
        },

        POD_CLOSE_BUTTON {
            @Override
            public String toString() { return "MyList.PodClose.Button"; }
        },

        BOTTOM_YCS_DISCLAIMER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.BottomYCSDisclaimer.WebElement"; }
        },

        BUSY_LOAD_SPINNER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.BusyLoadSpinner.WebElement"; }
        },

        TOP_FILTER_EDIT {
            @Override
            public String toString() { return "MyList.TopFilter.Edit"; }
        },

        CLEAR_FILTER_LINK {
            @Override
            public String toString() { return "MyList.ClearFilter.Link"; }
        },

        VIEW_NEXT_OFFER_BUTTON {
            @Override
            public String toString() { return "MyList.ViewNextOffer.Button"; }
        },

        OFFER_ROWS_WEBELEMENT {
            @Override
            public String toString() { return "MyList.OfferRows.WebElement"; }
        },

        OFFER_TITLE_BY_INDEX_LINK {
            @Override
            public String toString() { return "MyList.OfferTitleByIndex.Link"; }
        },

        OFFER_TITLE_BY_NAME_LINK {
            @Override
            public String toString() { return "MyList.OfferTitleByName.Link"; }
        },

        OFFER_SUMMARY_BY_INDEX_LINK {
            @Override
            public String toString() { return "MyList.OfferSummaryByIndex.WebElement"; }
        },

        OFFER_DESCRIPTION_BY_INDEX_LINK {
            @Override
            public String toString() { return "MyList.OfferDescriptionByIndex.WebElement"; }
        },

        ITEM_REMOVE_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "MyList.ItemRemoveByIndex.WebElement"; }
        },

        OFFER_NAME_AND_DESCRIPTION_WEBELEMENT {
            @Override
            public String toString() { return "MyList.OfferNameAndDescription.WebElement"; }
        },

        OFFER_NAME_AND_DESCRIPTION_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "MyList.OfferNameAndDescriptionByIndex.WebElement"; }
        },

        ITEM_NAME_BY_INDEX_EDIT {
            @Override
            public String toString() { return "MyList.ItemNameByIndex.Edit"; }
        },

        ITEM_QUANTITY_BY_INDEX_EDIT {
            @Override
            public String toString() { return "MyList.ItemQuantityByIndex.Edit"; }
        },

        ITEM_CATEGORY_BY_INDEX_LIST {
            @Override
            public String toString() { return "MyList.ItemCategoryByIndex.List"; }
        },

        ADD_ALL_ITEMS_TO_LIST_BUTTON {
            @Override
            public String toString() { return "MyList.AddAllItemsToList.Button"; }
        },

        ADD_ITEM_BUTTON {
            @Override
            public String toString() { return "MyList.AddItem.Button"; }
        },

        POPUP_CANCEL_LINK {
            @Override
            public String toString() { return "MyList.PopUpCancel.Link"; }
        },

        ADD_ITEM_TABLE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.AddItemTable.WebElement"; }
        },

        SESSION_TIMEOUT_ERROR_WEBELEMENT {
            @Override
            public String toString() { return "MyList.SessionTimeOutError.WebElement"; }
        },

        SESSION_TIMEOUT_PLEASE_SIGN_IN_LINK {
            @Override
            public String toString() { return "MyList.SessionTimeOutPleaseSignIn.Link"; }
        },

        PURCHASE_HISTORY_ALL_ADD_TO_LIST_BUTTON {
            @Override
            public String toString() { return "MyList.PurchaseHistoryAllAddToList.Button"; }
        },

        PURCHASE_HISTORY_ALL_ITEM_TITLE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PurchaseHistoryAllItemTitle.WebElement"; }
        },

        PURCHASE_HISTORY_OFFER_NAME_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PurchaseHistoryOfferNameByIndex.WebElement"; }
        },

        PURCHASE_HISTORY_ALL_OFFER_DETAILS_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PurchaseHistoryAllOfferDetails.WebElement"; }
        },

        DISCLAIMER_TEXT_WEBELEMENT {
            @Override
            public String toString() { return "MyList.DisclaimerText.WebElement"; }
        },

        MESSAGE_BODY_MYCARD_LINK {
            @Override
            public String toString() { return "MyList.MessageBodyMyCard.Link"; }
        },

        MESSAGE_BODY_ADD_YOUR_OWN_ITEMS_LINK {
            @Override
            public String toString() { return "MyList.MessageBodyAddYourOwnItems.Link"; }
        },


        BOXTOP_DO_NOT_SHOW_AGAIN_LINK {
            @Override
            public String toString() { return "MyList.BoxTopDoNotShowAgain.Link"; }
        },

        BOXTOP_ENROLL_NOW_BUTTON {
            @Override
            public String toString() { return "MyList.BoxTopEnrollNow.Button"; }
        },

        BOXTOP_CLOSE_BUTTON {
            @Override
            public String toString() { return "MyList.BoxTopClose.Button"; }
        },

        BOXTOP_MESSAGE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.BoxTopMessage.WebElement"; }
        },

        MESSAGE_BODY_MYCARD_ADDYOUROWNITEM_WEBLEMENT {
            @Override
            public String toString() { return "MyList.MessageBodyMyCardAddYourOwnItems.Weblement"; }
        },

        CUSTOM_ITEM_NAME_WEBLEMENT {
            @Override
            public String toString() { return "MyList.CustomItemName.WebElement"; }
        },

        NO_OFFERS_LOADED_MESSAGE_WEBELEMENT{
            @Override
            public String toString() { return "MyList.NoOffersLoadedMessage.WebElement"; }
        },

        NO_OFFERS_LOADED_MESSAGE_J4U_LINK{
            @Override
            public String toString() { return "MyList.NoOffersLoadedMessageJ4U.Link"; }
        },

        NO_OFFERS_LOADED_MESSAGE_ADD_CUSTOM_ITEM_LINK{
            @Override
            public String toString() { return "MyList.NoOffersLoadedMessageAddCustomItem.Link"; }
        },

        BOTTOM_CC_DISCLAIMER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.BottomCCDisclaimer.WebElement"; }
        },

        BOTTOM_GAS_DISCLAIMER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.BottomGASDisclaimer.WebElement"; }
        },

        BOTTOM_GAS_LTS_DISCLAIMER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.BottomGasLTSDisclaimer.WebElement"; }
        },

        INCLUDE_IN_PRINT_COLUMNHEADER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.IncludeInPrintOrEmailColumnHeader.WebElement"; }
        },

        LIST_ITEM_DESCRIPTION_COLUMNHEADER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.ListItemDescriptionColumnHeader.WebElement"; }
        },

        OFFER_DETAILS_COLUMNHEADER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.OfferDetailsColumnHeader.WebElement"; }
        },

        REMOVE_FROM_LIST_COLUMNHEADER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.RemoveFromListColumnHeader.WebElement"; }
        },

        LEFTNAV_ITEM_BY_INDEX_LINK {
            @Override
            public String toString() { return "MyList.LeftNavItemByIndex.Link"; }
        },

        LEFTNAV_ITEM_CATEGORY_BY_INDEX_LINK {
            @Override
            public String toString() { return "MyList.LeftNavItemCategoryByIndex.Link"; }
        },

        LEFTNAV_ITEM_BY_NAME_LINK {
            @Override
            public String toString() { return "MyList.LeftNavItemByName.Link"; }
        },

        LEFTNAV_ITEM_CATEGORY_BY_NAME_LINK {
            @Override
            public String toString() { return "MyList.LeftNavItemCategoryByName.Link"; }
        },

        CUSTOM_ITEM_EDIT_BY_INDEX_LINK {
            @Override
            public String toString() { return "MyList.CustomItemEditByIndex.Link"; }
        },

        EDIT_CUSTOM_ITEM_NAME_EDIT {
            @Override
            public String toString() { return "MyList.EditCustomItemName.Edit"; }
        },

        EDIT_CUSTOM_ITEM_QUANTITY_EDIT {
            @Override
            public String toString() { return "MyList.EditCustomItemQuantity.Edit"; }
        },

        EDIT_CUSTOM_ITEM_CATEGORY_LIST {
            @Override
            public String toString() { return "MyList.EditCustomItemCategory.List"; }
        },

        EDIT_CUSTOM_ITEM_CANCEL_BUTTON {
            @Override
            public String toString() { return "MyList.EditCustomItemCancel.Button"; }
        },

        EDIT_CUSTOM_ITEM_CONFIRM_BUTTON {
            @Override
            public String toString() { return "MyList.EditCustomItemConfirm.Button"; }
        },

        EDIT_CUSTOM_ITEM_NAME_LABEL_WEBELEMENT {
            @Override
            public String toString() { return "MyList.EditCustomItemNameLabel.WebElement"; }
        },

        NO_SELECTED_ITEM_ERROR_MESSAGE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.NoSelectedItemErrorMessage.WebElement"; }
        },

        CATEGORY_COLLAPSED_WEBELEMENT {
            @Override
            public String toString() { return "MyList.Category.Collapsed.WebElement"; }
        },

        CATEGORY_EXPANDED_WEBELEMENT {
            @Override
            public String toString() { return "MyList.Category.Expanded.WebElement"; }
        },

        PH_CATEGORY_COLLAPSED_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PH_Category.Collapsed.WebElement"; }
        },

        PH_CATEGORY_EXPANDED_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PH_Category.Expanded.WebElement"; }
        },

        MYLIST_ADD_YOUR_OWN_ITEMS_INMESSAGE_LINK {
            @Override
            public String toString() { return "MyList.AddYourOwnItemsInMessage.Link"; }
        },
        MYLIST_YCS_CLIPPED_OFFER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.YCSClippedoffer.Webelement"; }
        },
        MYLIST_CC_CLIPPED_OFFER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.CCClippedOffer.Webelement"; }
        },
        MYLIST_PD_CLIPPED_OFFER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PDClippedOffer.Webelement"; }
        },

        NEW_OFFER_AVAILABLE_LINK {
            @Override
            public String toString() { return "MyList.NewOfferAvailable.Link"; }
        },

        NEW_OFFER_AVAILABLE_BY_INDEX_LINK {
            @Override
            public String toString() { return "MyList.NewOfferAvailableByIndex.Link"; }
        },

        POPUP_OFFERNAME_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PopUpOfferName.WebElement"; }
        },

        POPUP_OFFER_IMAGE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PopUpOfferImage.WebElement"; }
        },

        POPUP_OFFER_TYPE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PopUpOfferType.WebElement"; }
        },

        POPUP_OFFER_EXPIRATION_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PopUpOfferExpiration.WebElement"; }
        },

        POPUP_ADD_BUTTON {
            @Override
            public String toString() { return "MyList.PopUpAdd.Button"; }
        },

        POPUP_J4U_LOGO_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PopUpJ4ULogo.WebElement"; }
        },

        POPUP_DISCOUNTED_PRICE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PopUpDiscountedPrice.WebElement"; }
        },

        POPUP_COMPETITOR_PRICE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PopUpCompetitorPrice.WebElement"; }
        },

        POPUP_PERSONALIZED_REG_PRICE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PopUpPersonalizedRegPrice.WebElement"; }
        },

        POPUP_OFFER_PRICE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PopUpOfferPrice.WebElement"; }
        },

        POPUP_PERSONALIZED_PRICE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PopUpOfferPersonalizedPrice.WebElement"; }
        },

        PURCHASE_HISTORY_MATCHED_OFFER_LINK {
            @Override
            public String toString() { return "MyList.PurchaseHistoryMatchedOffer.Link"; }
        },

        PURCHASE_HISTORY_ADD_TO_LIST_BY_INDEX_LINK {
            @Override
            public String toString() { return "MyList.PurchaseHistoryAddToListByIndex.Button"; }
        },

        PURCHASE_HISTORY_ADDED_TO_LIST_BY_INDEX_LINK {
            @Override
            public String toString() { return "MyList.PurchaseHistoryAddedToListByIndex.Button"; }
        },

        PURCHASE_HISTORY_ADDED_TO_LIST_BY_NAME_LINK {
            @Override
            public String toString() { return "MyList.PurchaseHistoryAddedToListByName.Button"; }
        },

        OFFER_IMAGE_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "MyList.OfferImageByIndex.WebElement"; }
        },

        PURCHASE_HISTORY_NO_PURCHASE_MESSAGE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PurchaseHistoryNoPurchaseMessage.Webelement"; }
        },

        EXPIRATION_DATE_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "MyList.ExpirationDateByIndex.WebElement"; }
        },

        REBAG_REDUCE_RETHINK_WEBELEMENT {
            @Override
            public String toString() { return "MyList.RebagReduceRethink.WebElement"; }
        },

        PH_OFFER_TITLE_BY_INDEX_LINK {
            @Override
            public String toString() { return "MyList.PHOfferTitleByIndex.Link"; }
        },

        SELECTED_LEFTNAV_ITEM_LINK {
            @Override
            public String toString() { return "MyList.SelectedLeftNavItem.Link"; }
        },

        NO_RESULTS_ERROR_FILTER_WEBELEMENT {
            @Override
            public String toString() { return "MyList.NoResultsErrorFilter.WebElement"; }
        },

        NO_SEARCH_RESULT_CATEGORY_WEBELEMENT {
            @Override
            public String toString() { return "MyList.NoSearchResultCategory.WebElement"; }
        },

        RELATED_LINKS_SECTION_WEBELEMENT {
            @Override
            public String toString() { return "MyList.RelatedLinksSection.WebElement"; }
        },

        RELATED_LINKS_LABEL_WEBELEMENT {
            @Override
            public String toString() { return "MyList.RelatedLinksLabel.WebElement"; }
        },

        BACK_TO_TOP_BUTTON {
            @Override
            public String toString() { return "MyList.BackToTop.Button"; }
        },

        BACK_TO_TOP_BACKGROUND_BUTTON {
            @Override
            public String toString() { return "MyList.BackToTopBackground.Button"; }
        },

        RELATED_LINKS_SECTION_BACKGROUND_WEBELEMENT {
            @Override
            public String toString() { return "MyList.RelatedLinksSectionBackground.WebElement"; }
        },

        RL_SEPARATOR_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "MyList.RLSeparatorByIndex.WebElement"; }
        },

        RL_SPACE_HEIGHT_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "MyList.RLSpaceHeightByIndex.WebElement"; }
        },

        RL_PADDING_BOTTOM_WEBELEMENT {
            @Override
            public String toString() { return "MyList.RLPaddingBottom.WebElement"; }
        },

        RL_COUPONS_DEALS_LINK {
            @Override
            public String toString() { return "MyList.RLCouponsDeals.Link"; }
        },

        RL_COUPON_POLICY_LINK {
            @Override
            public String toString() { return "MyList.RLCouponPolicy.Link"; }
        },

        RL_FAQ_LINK {
            @Override
            public String toString() { return "MyList.RLFAQ.Link"; }
        },

        X_MASK_WEBELEMENT {
            @Override
            public String toString() { return "MyList.XMask.WebElement"; }
        },

        INCLUDE_IN_PRINT_EMAIL_CHECKBOX {
            @Override
            public String toString() { return "MyList.IncludeInPrintEmail.Checkbox"; }
        },

        REWARDS_SECTION_WEBELEMENT {
            @Override
            public String toString() { return "MyList.RewardsSection.WebElement"; }
        },

        PRINT_INCLUDE_CANCEL_PRINT_BUTTON {
            @Override
            public String toString() { return "MyList.PrintIncludeCancelPrint.Link"; }
        },

        PRINT_INCLUDE_MESSAGE_WEBELEMENT {
            @Override
            public String toString() { return "MyList.PrintIncludeMessage.WebElement"; }
        },

    }

    public enum CouponPolicyPage {

        HEADER_WEBELEMENT {
            @Override
            public String toString() { return "CouponPolicy.Header.WebElement"; }
        },

        SECTION_HEADER_WEBELEMENT {
            @Override
            public String toString() { return "CouponPolicy.SectionHeader.WebElement"; }
        },

        SECTION_ITEMS_WEBELEMENT {
            @Override
            public String toString() { return "CouponPolicy.SectionItems.WebElement"; }
        }
    }

    public enum FAQPage {

        HEADER_WEBELEMENT {
            @Override
            public String toString() { return "FAQ.Header.WebElement"; }
        }

    }

    public enum MyAccountSummaryPage {

        HEADER_WEBELEMENT {
            @Override
            public String toString() { return "MyAccountSummary.Header.WebElement"; }
        },

        EDIT_CONTACT_INFORMATION_LINK {
            @Override
            public String toString() { return "MyAccountSummary.EditContactInformation.Link"; }
        },

        EDIT_EMAIL_ADDRESS_LINK {
            @Override
            public String toString() { return "MyAccountSummary.EditEmailAddress.Link"; }
        },

        POPUP_CLOSE_LINK {
            @Override
            public String toString() { return "MyAccountSummary.PopUpClose.Link"; }
        },

        LEFTNAV_CONTACT_INFORMATION_LINK {
            @Override
            public String toString() { return "MyAccountLeftNav.ContactInformation.Link"; }
        },

    }

    public enum MyAccountContactInfoPage {

        EDIT_ZIPCODE_LINK {
            @Override
            public String toString() { return "MyAccountContactInformation.EditZipCode.Link"; }
        },

        ZIPCODE_EDIT {
            @Override
            public String toString() { return "MyAccountContactInformation.ZipCode.Edit"; }
        },

        CONFIRM_ZIPCODE_LINK {
            @Override
            public String toString() { return "MyAccountContactInformation.ConfirmZipCode.Link"; }
        },

        SAVE_CHANGES_BUTTON {
            @Override
            public String toString() { return "MyAccountContactInformation.SaveChanges.Button"; }
        },

        SELECT_CITY_LIST {
            @Override
            public String toString() { return "MyAccountContactInformation.SelectCity.List"; }
        },

        PHONE_NUMBER_EDIT {
            @Override
            public String toString() { return "MyAccountContactInformation.PhoneNumber.Edit"; }
        },

        UPDATE_CONFIRMATION_WEBELEMENT {
            @Override
            public String toString() { return "MyAccountContactInformation.UpdateConfirmation.WebElement"; }
        },





    }


    public enum MyStorePage {

        HEADER_WEBELEMENT {
            @Override
            public String toString() { return "MyStore.Header.WebElement"; }
        },

        SEARCH_EDIT {
            @Override
            public String toString() { return "MyStore.Search.Edit"; }
        },

        SEARCH_BUTTON {
            @Override
            public String toString() { return "MyStore.Search.Button"; }
        },

        MAKE_THIS_MY_STORE_BUTTON {
            @Override
            public String toString() { return "MyStore.MakeThisMyStore.Button"; }
        },

        IFRAME_WEBELEMENT {
            @Override
            public String toString() { return "MyStore.iFrame.WebElement"; }
        },

        STORE_ADDRESS_BY_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "MyStore.StoreAddressByIndex.WebElement"; }
        }
    }

    public enum StoreLocatorPage {

        HEADER_WEBELEMENT {
            @Override
            public String toString() { return "StoreLocator.Header.WebElement"; }
        },

        SEARCH_EDIT {
            @Override
            public String toString() { return "StoreLocator.Search.Edit"; }
        },

        SEARCH_BUTTON {
            @Override
            public String toString() { return "StoreLocator.Search.Button"; }
        },

        STORES_TAB {
            @Override
            public String toString() { return "StoreLocator.Stores.Tab"; }
        },

        GAS_STATIONS_TAB {
            @Override
            public String toString() { return "StoreLocator.GasStations.Tab"; }
        },

        SEARCH_RADIUS_RADIOBUTTON {
            @Override
            public String toString() { return "StoreLocator.SearchRadius.RadioButton"; }
        }

    }

    public enum GmailSignInPage {
        USERNAME_EDIT {
            @Override
            public String toString() { return "GmailSignIn.Username.Edit"; }
        },

        PASSWORD_EDIT {
            @Override
            public String toString() { return "GmailSignIn.Password.Edit"; }
        },

        NEXT_BUTTON {
            @Override
            public String toString() { return "GmailSignIn.Next.Button"; }
        },

        SIGN_IN_BUTTON {
            @Override
            public String toString() { return "GmailSignIn.SignIn.Button"; }
        },

        REMEMBER_CHECKBOX {
            @Override
            public String toString() { return "GmailSignIn.RememberMe.CheckBox"; }
        }
    }

    public enum GmailMailboxPage {

        INBOX_LINK {
            @Override
            public String toString() { return "GmailMailbox.Inbox.Link"; }
        }
    }

    public enum CampaignPage {

        ADD_OFFER_BY_INDEX_BUTTON {
            @Override
            public String toString() { return "Campaign.AddOfferByIndex.Button"; }
        },

        ADDED_OFFER_BY_POSITION_INDEX_WEBELEMENT {
            @Override
            public String toString() { return "Campaign.AddedOfferByPositionIndex.WebElement"; }
        },

        SESSION_TIMEOUT_ERROR_WEBELEMENT {
            @Override
            public String toString() { return "Campaign.SessionTimeOutError.WebElement"; }
        },

        SESSION_TIMEOUT_PLEASE_SIGN_IN_LINK {
            @Override
            public String toString() { return "Campaign.SessionTimeOutPleaseSignIn.Link"; }
        },

        CLIPPED_OFFER_NAME_LINK {
            @Override
            public String toString() { return "Campaign.ClippedOfferName.Link"; }
        },

        OFFER_NAME_LINK {
            @Override
            public String toString() { return "Campaign.OfferName.Link"; }
        },

        EVENT_NOT_AVAILABLE_WEBELEMENT {
            @Override
            public String toString() { return "Campaign.EventNotAvailable.WebElement"; }
        },

        JUST_FOR_U_ERROR_MESSAGE_LINK {
            @Override
            public String toString() { return "Campaign.justForUErrorMessage.Link"; }
        },
        OFFER_TITLE_BY_INDEX_LINK {
            @Override
            public String toString() { return "Campaign.OfferTitleByIndex.Link"; }
        },
        BIG_POD_ADD_BUTTON {
            @Override
            public String toString() { return "Campaign.BigPOD.Add.Button"; }
        },
        BIG_POD_ADDED_BUTTON {
            @Override
            public String toString() { return "Campaign.BigPOD.Added.Button"; }
        },
        BIG_POD_CLOSE_BUTTON {
            @Override
            public String toString() { return "Campaign.BigPOD.Close.Button"; }
        },

    }

    public enum BTFEPage {
        BANNER_WEBELEMENT {
            @Override
            public String toString() { return "BTFEPage.Banner.WebElement"; }
        },

        ENROLL_NOW_BUTTON {
            @Override
            public String toString() { return "BTFEPage.EnrollNow.Button"; }
        },

        SEARCH_INPUT_BOX_WEBEDIT {
            @Override
            public String toString() { return "BTFEPage.SearchInputBox.Edit"; }
        },

        SEARCH_INPUT_BUTTON {
            @Override
            public String toString() { return "BTFEPage.SearchInput.Button"; }
        },

        SELECT_THIS_SCHOOL_BY_INDEX_LINK {
            @Override
            public String toString() { return "BTFEPage.SelectThisSchoolByIndex.Link"; }
        },

        SCHOOL_ADDRESS_BY_INDEX_LINK {
            @Override
            public String toString() { return "BTFEPage.SchoolAdressByIndex.WebElement"; }
        },

        CLOSE_SCHOOL_RESULT_BUTTON {
            @Override
            public String toString() { return "BTFEPage.CloseSchoolResult.Button"; }
        },

        FIRST_NAME_WEBEDIT {
            @Override
            public String toString() { return "BTFEPage.FirstName.Edit"; }
        },

        LAST_NAME_WEBEDIT {
            @Override
            public String toString() { return "BTFEPage.LastName.Edit"; }
        },

        ZIPCODE_WEBEDIT {
            @Override
            public String toString() { return "BTFEPage.ZipCode.Edit"; }
        },

        BIRTH_MONTH_LIST {
            @Override
            public String toString() { return "BTFEPage.BirthMonth.List"; }
        },

        BIRTH_DAY_LIST {
            @Override
            public String toString() { return "BTFEPage.BirthDay.List"; }
        },

        BIRTH_YEAR_LIST {
            @Override
            public String toString() { return "BTFEPage.BirthYear.List"; }
        },

        LANGUAGE_LIST {
            @Override
            public String toString() { return "BTFEPage.Language.List"; }
        },

        NEXT_WEBELEMENT {
            @Override
            public String toString() { return "BTFEPage.Next.WebElement"; }
        },

        PASSWORD_WEBEDIT {
            @Override
            public String toString() { return "BTFEPage.Password.Edit"; }
        },

        CONFIRM_PASSWORD_WEBEDIT {
            @Override
            public String toString() { return "BTFEPage.ConfirmPassword.Edit"; }
        },

        JOIN_NOW_WEBELEMENT {
            @Override
            public String toString() { return "BTFEPage.JoinNow.WebElement"; }
        },

        EMAIL_ADDRESS_WEBEDIT {
            @Override
            public String toString() { return "BTFEPage.EmailAddress.Edit"; }
        },

        VIEW_OFFERS_BUTTON {
            @Override
            public String toString() { return "BTFEPage.ViewOffers.Buttom"; }
        },
    }

    public enum LogixSignInPage {

        LOGIN_TAB {
            @Override
            public String toString() { return "LogixSignIn.Login.Tab"; }
        },

        USERNAME_EDIT {
            @Override
            public String toString() { return "LogixSignIn.Username.Edit"; }
        },

        PASSWORD_EDIT {
            @Override
            public String toString() { return "LogixSignIn.Password.Edit"; }
        },

        LOGIN_BUTTON {
            @Override
            public String toString() { return "LogixSignIn.Login.Button"; }
        },
    }

    public enum LogixPage {

        CUSTOMERS_TAB {
            @Override
            public String toString() { return "LogixPage.CustomersTab.WebElement"; }
        },

        CUSTOMERS_INQUIRY_TAB {
            @Override
            public String toString() { return "LogixPage.CustomersInquiry.Tab"; }
        },

        CUSTOMERS_INQUIRY_LIST {
            @Override
            public String toString() { return "LogixPage.CustomersInquiry.List"; }
        },

        CUSTOMERS_HOUSEHOLDID_EDIT {
            @Override
            public String toString() { return "LogixPage.CustomersHouseholdId.Edit"; }
        },

        CUSTOMERS_INQUIRY_HHID_SEARCH_BUTTON {
            @Override
            public String toString() { return "LogixPage.CustomersInquiryHHIDSearch.Button"; }
        },

        CUSTOMERS_INQUIRY_SEARCH_CCNBR_TYPE_LIST {
            @Override
            public String toString() { return "LogixPage.CustomersInquirySearchClubCardNbrCardType.List"; }
        },

        CUSTOMERS_INQUIRY_HHID_NORESULTS_EDIT {
            @Override
            public String toString() { return "LogixPage.CustomersInquiryHHIDNoResults.Edit"; }
        },

        CUSTOMERS_INQUIRY_HHID_FIRSTRESULT_OFFERNAME_EDIT {
            @Override
            public String toString() { return "LogixPage.CustomersInquiryHHIDFirstResultOffername.Edit"; }
        },

        CUSTOMERS_INQUIRY_SEARCH_CLUBCARDNBR_LIST {
            @Override
            public String toString() { return "LogixPage.CustomersInquirySearchClubCardNbr.List"; }
        },

        CUSTOMERS_CLUBCARDNBR_EDIT {
            @Override
            public String toString() { return "LogixPage.CustomersClubCardNbr.Edit"; }
        },

        CUSTOMERS_INQUIRY_CCNBR_NORESULTS_EDIT {
            @Override
            public String toString() { return "LogixPage.CustomersInquiryCCnbrNoResults.Edit"; }
        },

        CUSTOMERS_INQUIRY_CCNBR_FIRSTRESULT_OFFERNAME_EDIT {
            @Override
            public String toString() { return "LogixPage.CustomersInquiryCCnbrFirstResultOfferName.Edit"; }
        },

        LOGOUT_LINK {
            @Override
            public String toString() { return "LogixPage.Logout.Link"; }
        },
    }
}
