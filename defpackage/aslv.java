package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aslv {
    public static final cqce a = cqce.g("Bugle", "RbmBusinessInfoDataService");
    public final eosc b;
    public final dqsn c;

    public aslv(eosc eoscVar, dqsn dqsnVar) {
        this.b = eoscVar;
        this.c = dqsnVar;
    }

    public static void b(BusinessInfoData businessInfoData, long j) {
        cqce cqceVar = a;
        cqceVar.p("Beginning RBM business info validation...");
        e(businessInfoData.getRbmBotId(), "rbmBotId");
        e(businessInfoData.getName(), "displayName");
        e(businessInfoData.getLogoImageRemoteUrl(), "logoImageRemoteUrl");
        e(businessInfoData.getLogoImageLocalUri(), "logoImageLocalUri");
        e(businessInfoData.getDescription(), "description");
        e(businessInfoData.getColor(), BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR);
        e(businessInfoData.getHeroImageRemoteUrl(), "heroImageRemoteUrl");
        e(businessInfoData.getHeroImageLocalUri(), "heroImageLocalUri");
        if (j >= 0) {
            cqceVar.p("Successfully completed RBM business info validation...");
            return;
        }
        cqbd cqbdVarE = cqceVar.e();
        cqbdVarE.I("Invalid bot info. Negative expiryMilliseconds.");
        cqbdVarE.z("RBM bot info expiry milliseconds", j);
        cqbdVarE.r();
        throw new asoa("Invalid bot info. Negative expiryMilliseconds.", 5);
    }

    public static void c(BusinessInfoData businessInfoData) {
        cqce cqceVar = a;
        cqceVar.p("Beginning RBM business verifier info validation...");
        e(businessInfoData.getVerifierId(), "verifierId");
        e(businessInfoData.getVerifierName(), "verifierName");
        e(businessInfoData.getVerifierLogoImageRemoteUrl(), "verifierLogoImageRemoteUrl");
        e(businessInfoData.getVerifierLogoImageLocalUri(), "verifierLogoImageLocalUri");
        cqceVar.p("Successfully completed RBM business verifier info validation...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Optional d(final String str) {
        if (TextUtils.isEmpty(str)) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Cannot retrieve business info from database; found empty bot id.");
            cqbdVarE.r();
            throw new asoa("Cannot retrieve business info from database; found empty bot id.", 2);
        }
        cqce cqceVar = a;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("Attempting read of business info data...");
        cqbdVarC.A("RBM bot id", cqcv.b(str));
        cqbdVarC.r();
        bkuw bkuwVarA = bkuz.a();
        bkuwVarA.A("getBusinessInfoDataSync-rbm_business_info_and_verifier_info");
        bkuwVarA.k(new bkux((bkuy) new Function() { // from class: aslg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bkuy bkuyVar = (bkuy) obj;
                bkuyVar.b(str);
                return bkuyVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bkuy())));
        ekgb ekgbVarZ = bkuwVarA.b().z();
        if (ekgbVarZ.isEmpty()) {
            cqceVar.p("Cannot create BusinessInfoData object from empty business info from database.");
            return Optional.empty();
        }
        bswc bswcVarA = bswf.a();
        bswcVarA.A("getBusinessInfoDataSync-rbm_business_info_properties");
        bswcVarA.k(new bswd((bswe) new Function() { // from class: aslm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bswe bsweVar = (bswe) obj;
                bsweVar.b(str);
                return bsweVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bswe())));
        ekgb ekgbVarZ2 = bswcVarA.b().z();
        bktm bktmVar = (bktm) ekgbVarZ.get(0);
        String strI = bktmVar.i();
        int size = ekgbVarZ2.size();
        int i = 0;
        while (i < size) {
            bsuv bsuvVar = (bsuv) ekgbVarZ2.get(i);
            if (bsuvVar.n() == null) {
                cqbd cqbdVarE2 = cqceVar.e();
                cqbdVarE2.I("Invalid bot info in database. Null property value.");
                cqbdVarE2.A("RBM bot id", cqcv.b(strI));
                cqbdVarE2.r();
                throw new asoa("Invalid bot info in database. Null property value.", 5);
            }
            i++;
            if (bsuvVar.m() == null) {
                cqbd cqbdVarE3 = cqceVar.e();
                cqbdVarE3.I("Invalid bot info in database. Null header.");
                cqbdVarE3.A("RBM bot id", cqcv.b(strI));
                cqbdVarE3.r();
                throw new asoa("Invalid bot info in database. Null header.", 5);
            }
        }
        BusinessInfoData.Builder builder = BusinessInfoData.builder(bktmVar.i());
        builder.setName(bktmVar.h());
        bktmVar.aA(2, "logo_image_remote_url");
        builder.setLogoImageRemoteUrl(bktmVar.a);
        bktmVar.aA(3, "logo_image_local_uri");
        builder.setLogoImageLocalUri(bktmVar.b);
        builder.setDescription(bktmVar.g());
        bktmVar.aA(5, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR);
        builder.setColor(bktmVar.c);
        bktmVar.aA(6, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL);
        builder.setHeroImageRemoteUrl(bktmVar.d);
        bktmVar.aA(7, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI);
        String str2 = bktmVar.e;
        str2.getClass();
        builder.setHeroImageLocalUri(str2);
        bktmVar.aA(11, "verifier_id");
        builder.setVerifierId(bktmVar.h);
        builder.setVerifierName(bktmVar.k());
        bktmVar.aA(13, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL);
        builder.setVerifierLogoImageRemoteUrl(bktmVar.i);
        builder.setVerifierLogoImageLocalUri(bktmVar.j());
        builder.setVerificationStatus(2);
        builder.setAgentUseCase(bktmVar.f());
        int size2 = ekgbVarZ2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bsuv bsuvVar2 = (bsuv) ekgbVarZ2.get(i2);
            int legacyTypeFromPropertyType = BusinessInfoData.getLegacyTypeFromPropertyType(bsuvVar2.k());
            String strN = bsuvVar2.n();
            strN.getClass();
            String strM = bsuvVar2.m();
            strM.getClass();
            bsuvVar2.aA(4, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER);
            String str3 = bsuvVar2.e;
            avbl avblVarK = bsuvVar2.k();
            builder.addProperty(legacyTypeFromPropertyType, strN, strM, str3, ((avblVarK == avbl.PROPERTY_TYPE_PRIMARY_EMAIL || avblVarK == avbl.PROPERTY_TYPE_PRIMARY_PHONE_NUMBER || avblVarK == avbl.PROPERTY_TYPE_PRIMARY_WEBSITE || avblVarK == avbl.PROPERTY_TYPE_SMS_NUMBER || avblVarK == avbl.PROPERTY_TYPE_TERMS_AND_CONDITIONS_URL || avblVarK == avbl.PROPERTY_X_GOOGLE_SHORT_CODE) ? 1 : 0) ^ 1);
        }
        BusinessInfoData businessInfoDataBuild = builder.build();
        bktm bktmVar2 = (bktm) ekgbVarZ.get(0);
        bktmVar2.aA(8, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
        String str4 = bktmVar2.f;
        bktm bktmVar3 = (bktm) ekgbVarZ.get(0);
        bktmVar3.aA(9, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS);
        long j = bktmVar3.g;
        cqbd cqbdVarC2 = cqceVar.c();
        cqbdVarC2.A("RBM bot id", cqcv.b(str));
        cqbdVarC2.A("RBM bot info version", str4);
        cqbdVarC2.z("RBM bot info expiry milliseconds", j);
        cqbdVarC2.r();
        b(businessInfoDataBuild, j);
        c(businessInfoDataBuild);
        return Optional.of(businessInfoDataBuild);
    }

    private static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            String strA = a.a(str2, "Invalid bot info. Empty ", ".");
            a.r(strA);
            throw new asoa(strA, 5);
        }
    }

    public final eiju a(final String str) {
        return eijx.g(new Callable() { // from class: aslq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aslv.d(str);
            }
        }, this.b);
    }
}
