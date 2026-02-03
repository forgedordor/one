package com.google.android.ims.rcsservice.businessinfo;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.avbl;
import defpackage.dfnr;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.dfod;
import defpackage.dfou;
import defpackage.dfow;
import defpackage.dhja;
import defpackage.ejwk;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.ekoe;
import j$.util.Objects;
import j$.util.Optional;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoData implements Parcelable {
    public static final int PLATFORM_GOOGLE = 1;
    public static final int PLATFORM_UNKNOWN = 0;
    public static final int PLATFORM_VODAFONE = 2;
    public static final int VERIFICATION_STATUS_UNKNOWN = 0;
    public static final int VERIFICATION_STATUS_UNVERIFIED = 1;
    public static final int VERIFICATION_STATUS_VERIFIED = 2;
    private AgentUseCase agentUseCase;
    private String color;
    private String description;
    private String heroImageLocalUri;
    private String heroImageRemoteUrl;
    private String logoImageLocalUri;
    private String logoImageRemoteUrl;
    private String name;
    private BusinessInfoPropertyCollection properties;
    private String rbmBotId;
    private int verificationStatus;
    private boolean verifiedBrand;
    private String verifierId;
    private String verifierLogoImageLocalUri;
    private String verifierLogoImageRemoteUrl;
    private String verifierName;
    public static final dfny<Boolean> fixPotentialNullableHeadersIssues = dfod.a(187984328);
    public static final dfny<Boolean> enableAgentUseCaseCategoryDeserialization = dfnv.b("enable_agent_use_case_category_deserialization");
    public static final Parcelable.Creator<BusinessInfoData> CREATOR = new Parcelable.Creator<BusinessInfoData>() { // from class: com.google.android.ims.rcsservice.businessinfo.BusinessInfoData.1
        private final String getNonNullString(Parcel parcel) {
            return Objects.toString(parcel.readString(), "");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public BusinessInfoData createFromParcel(Parcel parcel) {
            String nonNullString = getNonNullString(parcel);
            String nonNullString2 = getNonNullString(parcel);
            String nonNullString3 = getNonNullString(parcel);
            String string = parcel.readString();
            String nonNullString4 = getNonNullString(parcel);
            String nonNullString5 = getNonNullString(parcel);
            int i = parcel.readInt();
            String nonNullString6 = getNonNullString(parcel);
            String nonNullString7 = getNonNullString(parcel);
            int i2 = ekgb.d;
            ekfw ekfwVar = new ekfw();
            int i3 = parcel.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                ekfwVar.h((BusinessInfoProperty) parcel.readParcelable(BusinessInfoProperty.class.getClassLoader()));
            }
            ekgb ekgbVarG = ekfwVar.g();
            Builder builder = BusinessInfoData.builder(nonNullString);
            builder.setName(nonNullString2);
            builder.setLogoImageRemoteUrl(nonNullString3);
            builder.setLogoImageLocalUri(string);
            builder.setDescription(nonNullString4);
            builder.setColor(nonNullString5);
            builder.setVerificationStatus(i);
            builder.setHeroImageRemoteUrl(nonNullString6);
            builder.setHeroImageLocalUri(nonNullString7);
            if (dfnr.d()) {
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                builder.setVerifierId(string2);
                builder.setVerifierName(string3);
                builder.setVerifierLogoImageRemoteUrl(string4);
                builder.setVerifierLogoImageLocalUri(string5);
            }
            if (((Boolean) BusinessInfoData.enableAgentUseCaseCategoryDeserialization.a()).booleanValue()) {
                builder.setAgentUseCase(AgentUseCase.values()[parcel.readInt()]);
            }
            BusinessInfoData businessInfoDataBuild = builder.build();
            int i5 = ((ekoe) ekgbVarG).c;
            for (int i6 = 0; i6 < i5; i6++) {
                businessInfoDataBuild.properties.insert((BusinessInfoProperty) ekgbVarG.get(i6));
            }
            return businessInfoDataBuild;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BusinessInfoData[] newArray(int i) {
            return new BusinessInfoData[i];
        }
    };

    /* compiled from: PG */
    /* renamed from: com.google.android.ims.rcsservice.businessinfo.BusinessInfoData$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType;

        static {
            int[] iArr = new int[avbl.values().length];
            $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType = iArr;
            try {
                iArr[avbl.PROPERTY_TYPE_EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[avbl.PROPERTY_TYPE_PRIMARY_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[avbl.PROPERTY_TYPE_SMS_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[avbl.PROPERTY_TYPE_PHONE_NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[avbl.PROPERTY_TYPE_PRIMARY_PHONE_NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[avbl.PROPERTY_TYPE_WEBSITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[avbl.PROPERTY_TYPE_PRIMARY_WEBSITE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[avbl.PROPERTY_TYPE_TERMS_AND_CONDITIONS_URL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[avbl.PROPERTY_TYPE_PRIVACY_POLICY_URL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[avbl.PROPERTY_X_GOOGLE_SHORT_CODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$android$apps$messaging$shared$constants$Constants$RbmBusinessInfoPropertyType[avbl.PROPERTY_TYPE_UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BotPlatform {
    }

    /* compiled from: PG */
    public static class Builder {
        private AgentUseCase agentUseCase;
        private String color;
        private String description;
        private String heroImageLocalUri;
        private String heroImageRemoteUrl;
        private String logoImageLocalUri;
        private String logoImageRemoteUrl;
        private String name;
        private BusinessInfoPropertyCollection properties;
        private final String rbmBotId;
        private int verificationStatus;
        private boolean verifiedBrand;
        private String verifierId;
        private String verifierLogoImageLocalUri;
        private String verifierLogoImageRemoteUrl;
        private String verifierName;

        public Builder addOptionalEmailAddress(String str, String str2, String str3) {
            addProperty(0, str, str2, str3, 1);
            return this;
        }

        public Builder addOptionalPhoneNumber(String str, String str2, String str3) {
            addProperty(2, str, str2, str3, 1);
            return this;
        }

        public Builder addOptionalWebsite(String str, String str2, String str3) {
            addProperty(3, str, str2, str3, 1);
            return this;
        }

        public Builder addProperty(int i, String str, String str2, String str3, int i2) {
            if (TextUtils.isEmpty(str)) {
                dhja.q("Cannot create business info property with empty value", new Object[0]);
                return this;
            }
            this.properties.insert(BusinessInfoProperty.create(i, str, str2, str3, i2));
            return this;
        }

        public BusinessInfoData build() {
            BusinessInfoData businessInfoData = new BusinessInfoData();
            businessInfoData.rbmBotId = this.rbmBotId;
            businessInfoData.name = this.name;
            businessInfoData.logoImageRemoteUrl = this.logoImageRemoteUrl;
            businessInfoData.logoImageLocalUri = this.logoImageLocalUri;
            businessInfoData.description = this.description;
            businessInfoData.color = this.color;
            businessInfoData.properties = this.properties;
            businessInfoData.verificationStatus = this.verificationStatus;
            businessInfoData.heroImageRemoteUrl = this.heroImageRemoteUrl;
            businessInfoData.heroImageLocalUri = this.heroImageLocalUri;
            businessInfoData.verifiedBrand = this.verifiedBrand;
            businessInfoData.verifierId = this.verifierId;
            businessInfoData.verifierName = this.verifierName;
            businessInfoData.verifierLogoImageRemoteUrl = this.verifierLogoImageRemoteUrl;
            businessInfoData.verifierLogoImageLocalUri = this.verifierLogoImageLocalUri;
            businessInfoData.agentUseCase = this.agentUseCase;
            return businessInfoData;
        }

        public Builder clearProperties() {
            this.properties = new BusinessInfoPropertyCollection();
            return this;
        }

        public Builder setAgentUseCase(AgentUseCase agentUseCase) {
            this.agentUseCase = agentUseCase;
            return this;
        }

        public Builder setColor(String str) {
            this.color = str;
            return this;
        }

        public Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder setHeroImageLocalUri(String str) {
            this.heroImageLocalUri = str;
            return this;
        }

        public Builder setHeroImageRemoteUrl(String str) {
            this.heroImageRemoteUrl = str;
            return this;
        }

        public Builder setLogoImageLocalUri(String str) {
            this.logoImageLocalUri = str;
            return this;
        }

        public Builder setLogoImageRemoteUrl(String str) {
            this.logoImageRemoteUrl = str;
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        public Builder setPrimaryEmailAddress(String str, String str2, String str3) {
            addProperty(0, str, str2, str3, 0);
            return this;
        }

        public Builder setPrimaryPhoneNumber(String str, String str2, String str3) {
            addProperty(2, str, str2, str3, 0);
            return this;
        }

        public Builder setPrimaryWebsite(String str, String str2, String str3) {
            addProperty(3, str, str2, str3, 0);
            return this;
        }

        public Builder setPrivacyPolicyUrl(String str, String str2, String str3) {
            if (this.properties.getOptionalProperties(5).size() > 0) {
                dhja.q("Attempted to add multiple privacy policy URLs, ignoring URL: %s", str);
                return this;
            }
            addProperty(5, str, str2, str3, 1);
            return this;
        }

        public Builder setShortCode(String str, String str2, String str3) {
            addProperty(6, str, str2, str3, 0);
            return this;
        }

        public Builder setSmsNumber(String str, String str2, String str3) {
            addProperty(1, str, str2, str3, 0);
            return this;
        }

        public Builder setTermsAndConditionsUrl(String str, String str2, String str3) {
            addProperty(4, str, str2, str3, 0);
            return this;
        }

        public Builder setVerificationStatus(int i) {
            this.verificationStatus = i;
            return this;
        }

        public Builder setVerifiedBrand(boolean z) {
            this.verifiedBrand = z;
            return this;
        }

        public Builder setVerifierId(String str) {
            this.verifierId = str;
            return this;
        }

        public Builder setVerifierLogoImageLocalUri(String str) {
            this.verifierLogoImageLocalUri = str;
            return this;
        }

        public Builder setVerifierLogoImageRemoteUrl(String str) {
            this.verifierLogoImageRemoteUrl = str;
            return this;
        }

        public Builder setVerifierName(String str) {
            this.verifierName = str;
            return this;
        }

        private Builder(String str) {
            this.rbmBotId = str;
            this.properties = new BusinessInfoPropertyCollection();
            this.agentUseCase = AgentUseCase.AGENT_USE_CASE_UNSPECIFIED;
        }
    }

    /* compiled from: PG */
    private static class BusinessInfoPropertyCollection {
        private final Map<Integer, BusinessInfoProperty> primaryProperties;
        private final Map<Integer, List<BusinessInfoProperty>> properties;

        private boolean containsPrimaryProperty(int i) {
            return getPrimaryProperty(i) != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<BusinessInfoProperty> getOptionalProperties(int i) {
            Map<Integer, List<BusinessInfoProperty>> map = this.properties;
            Integer numValueOf = Integer.valueOf(i);
            if (!map.containsKey(numValueOf)) {
                this.properties.put(numValueOf, new ArrayList());
            }
            List<BusinessInfoProperty> list = this.properties.get(numValueOf);
            list.getClass();
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(this.primaryProperties.get(numValueOf));
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BusinessInfoProperty getPrimaryProperty(int i) {
            return this.primaryProperties.get(Integer.valueOf(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<BusinessInfoProperty> getProperties() {
            ArrayList arrayList = new ArrayList();
            Iterator<List<BusinessInfoProperty>> it = this.properties.values().iterator();
            while (it.hasNext()) {
                Iterator<BusinessInfoProperty> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void insert(BusinessInfoProperty businessInfoProperty) {
            if (businessInfoProperty.getImportance() == 0) {
                if (containsPrimaryProperty(businessInfoProperty.getPropertyType())) {
                    dhja.q("Attempted to add multiple primary business properties of type %s, ignoring property with value %s", Integer.valueOf(businessInfoProperty.getPropertyType()), businessInfoProperty.getValue());
                    return;
                }
                this.primaryProperties.put(Integer.valueOf(businessInfoProperty.getPropertyType()), businessInfoProperty);
            }
            if (!this.properties.containsKey(Integer.valueOf(businessInfoProperty.getPropertyType()))) {
                this.properties.put(Integer.valueOf(businessInfoProperty.getPropertyType()), new ArrayList());
            }
            List<BusinessInfoProperty> list = this.properties.get(Integer.valueOf(businessInfoProperty.getPropertyType()));
            list.getClass();
            list.add(businessInfoProperty);
        }

        private BusinessInfoPropertyCollection() {
            this.properties = new LinkedHashMap();
            this.primaryProperties = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<BusinessInfoProperty> getProperties(int i) {
            Map<Integer, List<BusinessInfoProperty>> map = this.properties;
            Integer numValueOf = Integer.valueOf(i);
            if (!map.containsKey(numValueOf)) {
                this.properties.put(numValueOf, new ArrayList());
            }
            List<BusinessInfoProperty> list = this.properties.get(numValueOf);
            list.getClass();
            return list;
        }
    }

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface VerificationStatus {
    }

    private BusinessInfoData() {
        this.verificationStatus = 0;
    }

    public static Builder builder(String str) {
        return new Builder(str);
    }

    private static boolean columnExists(int i, String str) {
        boolean z = i != -1;
        if (!z) {
            dhja.k("Verifier info column %s does not exist.", str);
        }
        return z;
    }

    public static BusinessInfoData createFromCursors(Cursor cursor, Cursor cursor2) {
        if (cursor == null) {
            dhja.q("Cannot create BusinessInfoData object from null business info cursor", new Object[0]);
            return null;
        }
        if (!cursor.moveToFirst() || cursor.getCount() == 0) {
            dhja.q("Cannot create BusinessInfoData object from empty business info cursor", new Object[0]);
            return null;
        }
        String string = cursor.getString(cursor.getColumnIndex("rbm_bot_id"));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = cursor.getString(cursor.getColumnIndex("name"));
        String string3 = cursor.getString(cursor.getColumnIndex("logo_image_remote_url"));
        String string4 = cursor.getString(cursor.getColumnIndex("logo_image_local_uri"));
        String string5 = cursor.getString(cursor.getColumnIndex("description"));
        String strB = ejwk.b(cursor.getString(cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR)));
        int i = cursor.getInt(cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS));
        String string6 = cursor.getString(cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL));
        String string7 = cursor.getString(cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI));
        Builder builder = new Builder(string);
        builder.setName(string2);
        builder.setLogoImageRemoteUrl(string3);
        builder.setLogoImageLocalUri(string4);
        builder.setDescription(string5);
        builder.setColor(strB);
        builder.setVerificationStatus(i);
        builder.setHeroImageRemoteUrl(string6);
        builder.setHeroImageLocalUri(string7);
        if (dfnr.d()) {
            int columnIndex = cursor.getColumnIndex("verifier_id");
            int columnIndex2 = cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME);
            int columnIndex3 = cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL);
            int columnIndex4 = cursor.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI);
            if (columnExists(columnIndex, "verifier_id") && columnExists(columnIndex2, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME) && columnExists(columnIndex3, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL) && columnExists(columnIndex4, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI)) {
                String string8 = cursor.getString(columnIndex);
                String string9 = cursor.getString(columnIndex2);
                String string10 = cursor.getString(columnIndex3);
                String string11 = cursor.getString(columnIndex4);
                builder.setVerifierId(string8);
                builder.setVerifierName(string9);
                builder.setVerifierLogoImageRemoteUrl(string10);
                builder.setVerifierLogoImageLocalUri(string11);
            } else {
                dhja.k("At least one of the verifier info columns does not exist in the DB. Skipping read of verifier info data.", new Object[0]);
            }
        }
        if (cursor2 != null) {
            while (cursor2.moveToNext()) {
                int i2 = cursor2.getInt(cursor2.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE));
                String string12 = cursor2.getString(cursor2.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE));
                String string13 = cursor2.getString(cursor2.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER));
                String string14 = cursor2.getString(cursor2.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER));
                int i3 = cursor2.getInt(cursor2.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE));
                if (TextUtils.isEmpty(string12)) {
                    dhja.q("Cannot create business info property with empty value", new Object[0]);
                } else {
                    if (((Boolean) fixPotentialNullableHeadersIssues.a()).booleanValue() && string13 == null) {
                        if (i2 == 5 || i2 == 4) {
                            dhja.q("Setting null header to empty: %s, value: %s", Integer.valueOf(i2), string12);
                            string13 = "";
                        } else {
                            dhja.q("Cannot add property type: %s, value: %s, header: %s", Integer.valueOf(i2), string12, null);
                        }
                    }
                    builder.addProperty(i2, string12, string13, string14, i3);
                }
            }
        }
        return builder.build();
    }

    public static int getLegacyTypeFromPropertyType(avbl avblVar) {
        switch (avblVar.ordinal()) {
            case 2:
                return 1;
            case 3:
            case 8:
                return 2;
            case 4:
            case 9:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
            default:
                return 0;
            case 10:
                return 6;
        }
    }

    public static avbl getPropertyTypeFromLegacyType(BusinessInfoProperty businessInfoProperty) {
        switch (businessInfoProperty.getPropertyType()) {
            case 0:
                return businessInfoProperty.getImportance() == 0 ? avbl.PROPERTY_TYPE_PRIMARY_EMAIL : avbl.PROPERTY_TYPE_EMAIL;
            case 1:
                return avbl.PROPERTY_TYPE_SMS_NUMBER;
            case 2:
                return businessInfoProperty.getImportance() == 0 ? avbl.PROPERTY_TYPE_PRIMARY_PHONE_NUMBER : avbl.PROPERTY_TYPE_PHONE_NUMBER;
            case 3:
                return businessInfoProperty.getImportance() == 0 ? avbl.PROPERTY_TYPE_PRIMARY_WEBSITE : avbl.PROPERTY_TYPE_WEBSITE;
            case 4:
                return avbl.PROPERTY_TYPE_TERMS_AND_CONDITIONS_URL;
            case 5:
                return avbl.PROPERTY_TYPE_PRIVACY_POLICY_URL;
            case 6:
                return avbl.PROPERTY_X_GOOGLE_SHORT_CODE;
            default:
                return avbl.PROPERTY_TYPE_UNKNOWN;
        }
    }

    public boolean containsLocalVerifierInfo() {
        return (TextUtils.isEmpty(this.verifierName) || TextUtils.isEmpty(this.verifierLogoImageLocalUri)) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BusinessInfoData) {
            BusinessInfoData businessInfoData = (BusinessInfoData) obj;
            List properties = businessInfoData.properties.getProperties();
            List properties2 = this.properties.getProperties();
            Iterator it = properties.iterator();
            while (it.hasNext()) {
                if (!properties2.contains((BusinessInfoProperty) it.next())) {
                    return false;
                }
            }
            if (this.rbmBotId.equals(businessInfoData.rbmBotId) && Objects.equals(this.name, businessInfoData.name) && Objects.equals(this.logoImageRemoteUrl, businessInfoData.logoImageRemoteUrl) && Objects.equals(this.logoImageLocalUri, businessInfoData.logoImageLocalUri) && Objects.equals(this.description, businessInfoData.description) && Objects.equals(this.color, businessInfoData.color) && this.verificationStatus == businessInfoData.verificationStatus && Objects.equals(this.heroImageRemoteUrl, businessInfoData.heroImageRemoteUrl) && Objects.equals(this.heroImageLocalUri, businessInfoData.heroImageLocalUri) && Objects.equals(this.verifierId, businessInfoData.verifierId) && Objects.equals(this.verifierName, businessInfoData.verifierName) && Objects.equals(this.verifierLogoImageRemoteUrl, businessInfoData.verifierLogoImageRemoteUrl) && Objects.equals(this.verifierLogoImageLocalUri, businessInfoData.verifierLogoImageLocalUri) && this.agentUseCase == businessInfoData.agentUseCase && properties2.size() == properties.size()) {
                return true;
            }
        }
        return false;
    }

    public AgentUseCase getAgentUseCase() {
        return this.agentUseCase;
    }

    public String getColor() {
        return this.color;
    }

    public String getDescription() {
        return this.description;
    }

    public ekgb<BusinessInfoProperty> getEmailAddresses() {
        return ekgb.n(this.properties.getProperties(0));
    }

    public String getHeroImageLocalUri() {
        return this.heroImageLocalUri;
    }

    public String getHeroImageRemoteUrl() {
        return this.heroImageRemoteUrl;
    }

    public String getLogoImageLocalUri() {
        return this.logoImageLocalUri;
    }

    public String getLogoImageRemoteUrl() {
        return this.logoImageRemoteUrl;
    }

    public String getName() {
        return this.name;
    }

    public ekgb<BusinessInfoProperty> getOptionalEmailAddresses() {
        return ekgb.n(this.properties.getOptionalProperties(0));
    }

    public ekgb<BusinessInfoProperty> getOptionalPhoneNumbers() {
        return ekgb.n(this.properties.getOptionalProperties(2));
    }

    public ekgb<BusinessInfoProperty> getOptionalWebsites() {
        return ekgb.n(this.properties.getOptionalProperties(3));
    }

    public ekgb<BusinessInfoProperty> getPhoneNumbers() {
        return ekgb.n(this.properties.getProperties(2));
    }

    public BusinessInfoProperty getPrimaryEmailAddress() {
        return this.properties.getPrimaryProperty(0);
    }

    public BusinessInfoProperty getPrimaryPhoneNumber() {
        return this.properties.getPrimaryProperty(2);
    }

    public BusinessInfoProperty getPrimaryWebsite() {
        return this.properties.getPrimaryProperty(3);
    }

    public BusinessInfoProperty getPrivacyPolicyUrl() {
        List optionalProperties = this.properties.getOptionalProperties(5);
        if (optionalProperties.size() == 0) {
            return null;
        }
        if (optionalProperties.size() > 1) {
            dhja.q("Multiple Privacy Policy URLs in businessInfo, returning first URL", new Object[0]);
        }
        return (BusinessInfoProperty) optionalProperties.get(0);
    }

    public ekgb<BusinessInfoProperty> getProperties() {
        return ekgb.n(this.properties.getProperties());
    }

    public String getRbmBotId() {
        return this.rbmBotId;
    }

    public Optional<BusinessInfoProperty> getShortCode() {
        return Optional.ofNullable(this.properties.getPrimaryProperty(6));
    }

    public BusinessInfoProperty getSmsNumber() {
        return this.properties.getPrimaryProperty(1);
    }

    public BusinessInfoProperty getTermsAndConditionsUrl() {
        return this.properties.getPrimaryProperty(4);
    }

    public int getVerificationStatus() {
        return this.verificationStatus;
    }

    public int getVerifiedBotPlatform() {
        return getVerifiedBotPlatform(getRbmBotId());
    }

    public String getVerifierId() {
        return this.verifierId;
    }

    public String getVerifierLogoImageLocalUri() {
        return this.verifierLogoImageLocalUri;
    }

    public String getVerifierLogoImageRemoteUrl() {
        return this.verifierLogoImageRemoteUrl;
    }

    public String getVerifierName() {
        return this.verifierName;
    }

    public ekgb<BusinessInfoProperty> getWebsites() {
        return ekgb.n(this.properties.getProperties(3));
    }

    public int hashCode() {
        Iterator it = this.properties.getProperties().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode ^= ((BusinessInfoProperty) it.next()).hashCode();
        }
        return Objects.hash(this.rbmBotId, this.name, this.logoImageRemoteUrl, this.logoImageLocalUri, this.description, this.color, Integer.valueOf(this.verificationStatus), this.heroImageRemoteUrl, this.heroImageLocalUri, this.verifierId, this.verifierName, this.verifierLogoImageRemoteUrl, this.verifierLogoImageLocalUri, this.agentUseCase, Integer.valueOf(iHashCode));
    }

    public boolean isVerifiedBrand() {
        return this.verifiedBrand;
    }

    public void setHeroImageLocalUri(String str) {
        this.heroImageLocalUri = str;
    }

    public void setHeroImageUrl(String str) {
        this.heroImageRemoteUrl = str;
    }

    public void setLogoImageLocalUri(String str) {
        this.logoImageLocalUri = str;
    }

    public void setVerifierLogoImageLocalUri(String str) {
        this.verifierLogoImageLocalUri = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getRbmBotId());
        parcel.writeString(getName());
        parcel.writeString(getLogoImageRemoteUrl());
        parcel.writeString(getLogoImageLocalUri());
        parcel.writeString(getDescription());
        parcel.writeString(getColor());
        parcel.writeInt(getVerificationStatus());
        parcel.writeString(getHeroImageRemoteUrl());
        parcel.writeString(getHeroImageLocalUri());
        List properties = this.properties.getProperties();
        parcel.writeInt(properties.size());
        Iterator it = properties.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((BusinessInfoProperty) it.next(), i);
        }
        if (dfnr.d()) {
            parcel.writeString(getVerifierId());
            parcel.writeString(getVerifierName());
            parcel.writeString(null);
            parcel.writeString(getVerifierLogoImageRemoteUrl());
            parcel.writeString(getVerifierLogoImageLocalUri());
        }
        if (((Boolean) enableAgentUseCaseCategoryDeserialization.a()).booleanValue()) {
            parcel.writeInt(this.agentUseCase.ordinal());
        }
    }

    public static int getVerifiedBotPlatform(String str) {
        Pattern patternCompile = Pattern.compile((String) dfou.a().a.b.a());
        Pattern patternCompile2 = Pattern.compile((String) dfow.a().a.b.a());
        if (patternCompile.matcher(str).find()) {
            return 1;
        }
        return (patternCompile2.matcher(str).find() && ((Boolean) dfow.a().a.a.a()).booleanValue()) ? 2 : 0;
    }
}
