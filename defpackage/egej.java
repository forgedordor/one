package defpackage;

import android.accounts.Account;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egej {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/account/data/google/GcoreAccountName");
    public final boolean b;
    private final ejwi c;
    private final ejwi d;

    public egej(ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3) {
        this.c = ejwiVar;
        this.d = ejwiVar2;
        this.b = !((Boolean) ejwiVar3.e(false)).booleanValue();
    }

    public static String d(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        return g(lowerCase) ? String.valueOf(lowerCase.substring(0, lowerCase.lastIndexOf("@")).replace(".", "").replace('i', 'l').replace('1', 'l').replace('0', 'o').replace('2', 'z').replace('5', 's')).concat("@gmail.com") : lowerCase;
    }

    public static boolean g(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        return lowerCase.endsWith("@googlemail.com") || lowerCase.endsWith("@gmail.com");
    }

    public static final boolean h(egbs egbsVar) {
        return !egbsVar.i;
    }

    public final ListenableFuture a(efwo efwoVar) {
        return eooq.f(b(efwoVar), eiid.a(new ejvr() { // from class: egeh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str = (String) obj;
                ejwl.b(str != null, "AccountId was not a Google account");
                return new Account(str, "com.google");
            }
        }), eoqg.a);
    }

    public final ListenableFuture b(efwo efwoVar) {
        if (efwoVar == null) {
            return eork.h(new egdj());
        }
        ListenableFuture listenableFutureC = ((egcd) ((ejwt) this.c).a).c(efwoVar);
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: egef
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.e(((egbe) obj).b());
            }
        });
        eoqg eoqgVar = eoqg.a;
        return eooh.f(eooq.f(listenableFutureC, ejvrVarA, eoqgVar), IllegalArgumentException.class, eiid.a(new ejvr() { // from class: egeg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                throw new egdj((IllegalArgumentException) obj);
            }
        }), eoqgVar);
    }

    public final ListenableFuture c(final String str) {
        return str != null ? eooq.f(((egcd) ((ejwt) this.c).a).e(), eiid.a(new ejvr() { // from class: egee
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                List<egbe> list = (List) obj;
                Iterator it = list.iterator();
                while (true) {
                    String str2 = str;
                    egej egejVar = this.a;
                    if (!it.hasNext()) {
                        String strD = egej.d(str2);
                        for (egbe egbeVar : list) {
                            if (egej.h(egbeVar.b()) && egejVar.f(egbeVar.b())) {
                                if (strD.equals(egej.d(egbeVar.b().g))) {
                                    return egbeVar.a();
                                }
                                if (egejVar.b) {
                                    egbs egbsVarB = egbeVar.b();
                                    evsl evslVarCheckIsLite = evsn.checkIsLite(egfn.a);
                                    egbsVarB.d(evslVarCheckIsLite);
                                    Object objL = egbsVarB.r.l(evslVarCheckIsLite.d);
                                    for (String str3 : ((egfg) (objL == null ? evslVarCheckIsLite.b : evslVarCheckIsLite.c(objL))).d) {
                                        if (egej.g(str3)) {
                                            ((ekrd) ((ekrd) egej.a.i()).h("com/google/apps/tiktok/account/data/google/GcoreAccountName", "toAccountId", 180, "GcoreAccountName.java")).q("Found google email address as the old primary email address. This shouldn't happen because the primary email address cannot change once set to a google domain one.");
                                            if (strD.equals(egej.d(str3))) {
                                                return egbeVar.a();
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        throw new egdj();
                    }
                    egbe egbeVar2 = (egbe) it.next();
                    if (egej.h(egbeVar2.b()) && egejVar.f(egbeVar2.b())) {
                        if (str2.equals(egbeVar2.b().g)) {
                            return egbeVar2.a();
                        }
                        if (egejVar.b) {
                            egbs egbsVarB2 = egbeVar2.b();
                            evsl evslVarCheckIsLite2 = evsn.checkIsLite(egfn.a);
                            egbsVarB2.d(evslVarCheckIsLite2);
                            Object objL2 = egbsVarB2.r.l(evslVarCheckIsLite2.d);
                            Iterator<E> it2 = ((egfg) (objL2 == null ? evslVarCheckIsLite2.b : evslVarCheckIsLite2.c(objL2))).d.iterator();
                            while (it2.hasNext()) {
                                if (str2.equals((String) it2.next())) {
                                    return egbeVar2.a();
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }), eoqg.a) : eork.h(new egdj());
    }

    public final String e(egbs egbsVar) {
        if (((String) ((ejwt) this.d).a).equals(egbsVar.k)) {
            return egbsVar.g;
        }
        return null;
    }

    public final boolean f(egbs egbsVar) {
        return ((String) ((ejwt) this.d).a).equals(egbsVar.k);
    }
}
