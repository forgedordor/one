package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwcx {
    private final dvjj a;

    public dwcx(dvjj dvjjVar) {
        this.a = dvjjVar;
    }

    public static ezol b(dwpk dwpkVar) {
        dwpj dwpjVar = dwpj.UNKNOWN;
        felm felmVar = dwpkVar.b().ordinal() != 1 ? felm.EMAIL : felm.PHONE_NUMBER;
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).b = felmVar.a();
        String strD = dwpkVar.d();
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).c = strD;
        String strE = dwpkVar.e();
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).d = strE;
        return (ezol) ezokVar.build();
    }

    public static final ListenableFuture c(final cdpr cdprVar, String str, String str2, UUID uuid) {
        final HashMap map = new HashMap();
        if (str != null) {
            map.put("ID", str);
        }
        if (str2 != null) {
            map.put("APP_NAME", str2);
        }
        if (uuid != null) {
            map.put("REQUEST_ID", uuid.toString());
        }
        dvhv.a("RegReqBuilder", "DroidGuard Args: ".concat(map.toString()));
        return dvjq.a(new Callable() { // from class: dwcv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dcpn.a(cdprVar.a, "tachyon_registration", map);
            }
        });
    }

    public static final ListenableFuture d() {
        dvia.b();
        return eork.n(new eooy() { // from class: dwcs
            @Override // defpackage.eooy
            public final ListenableFuture a() throws dwcp {
                try {
                    Optional optionalA = abwt.a("466216207879", "FCM");
                    return eork.i(optionalA.isPresent() ? (String) optionalA.get() : "");
                } catch (Exception e) {
                    throw new dwcp(e);
                }
            }
        }, dvie.b().a);
    }

    public final ezlj a(String str, String str2, String str3, PublicKey publicKey) {
        ezli ezliVar = (ezli) ezlj.a.createBuilder();
        ezliVar.copyOnWrite();
        ezlj ezljVar = (ezlj) ezliVar.instance;
        str.getClass();
        ezljVar.f = str;
        ezliVar.copyOnWrite();
        ezlj ezljVar2 = (ezlj) ezliVar.instance;
        str2.getClass();
        ezljVar2.q = str2;
        String languageTag = Locale.getDefault().toLanguageTag();
        ezliVar.copyOnWrite();
        ezlj ezljVar3 = (ezlj) ezliVar.instance;
        languageTag.getClass();
        ezljVar3.j = languageTag;
        List listA = this.a.a();
        ezliVar.copyOnWrite();
        ezlj ezljVar4 = (ezlj) ezliVar.instance;
        evsx evsxVar = ezljVar4.k;
        if (!evsxVar.c()) {
            ezljVar4.k = evsn.mutableCopy(evsxVar);
        }
        evpz.addAll(listA, ezljVar4.k);
        ezof ezofVar = (ezof) ezog.a.createBuilder();
        ezofVar.copyOnWrite();
        ezog ezogVar = (ezog) ezofVar.instance;
        str.getClass();
        ezogVar.c = str;
        ezofVar.copyOnWrite();
        ((ezog) ezofVar.instance).b = 1;
        ezliVar.copyOnWrite();
        ezlj ezljVar5 = (ezlj) ezliVar.instance;
        ezog ezogVar2 = (ezog) ezofVar.build();
        ezogVar2.getClass();
        ezljVar5.e = ezogVar2;
        ezljVar5.b |= 1;
        ezpa ezpaVar = (ezpa) ezpb.a.createBuilder();
        evqs evqsVarX = evqs.x(publicKey.getEncoded());
        ezpaVar.copyOnWrite();
        ((ezpb) ezpaVar.instance).c = evqsVarX;
        ezpaVar.copyOnWrite();
        ((ezpb) ezpaVar.instance).b = felq.a(4);
        ezpb ezpbVar = (ezpb) ezpaVar.build();
        ezliVar.copyOnWrite();
        ezlj ezljVar6 = (ezlj) ezliVar.instance;
        ezpbVar.getClass();
        ezljVar6.i = ezpbVar;
        ezljVar6.b |= 4;
        if (str3 != null) {
            ezliVar.copyOnWrite();
            ezlj ezljVar7 = (ezlj) ezliVar.instance;
            ezljVar7.c = 7;
            ezljVar7.d = str3;
        }
        return (ezlj) ezliVar.build();
    }
}
