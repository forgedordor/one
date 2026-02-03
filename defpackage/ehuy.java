package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehuy {
    public final egpe a;

    public ehuy(final efwo efwoVar, final egcd egcdVar, final egej egejVar, final ejwi ejwiVar) {
        this.a = new egpe(new eooy() { // from class: ehux
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ListenableFuture listenableFutureC = egcdVar.c(efwoVar);
                final egej egejVar2 = egejVar;
                final ejwi ejwiVar2 = ejwiVar;
                return eika.j(listenableFutureC, new ejvr() { // from class: ehuw
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        egbe egbeVar = (egbe) obj;
                        if (egbeVar.b().k.equals("pseudonymous")) {
                            return new esoo(null, "pseudonymous");
                        }
                        if (egbeVar.b().k.equals("incognito")) {
                            return new esoo(null, "incognito");
                        }
                        if (egbeVar.b().k.equals("google")) {
                            ejwi ejwiVar3 = ejwiVar2;
                            egej egejVar3 = egejVar2;
                            ejwl.m(true, "OAuth authentication failed because no @GcoreAccountType was bound");
                            ejwl.r(((String) ((ejwt) ejwiVar3).a).equals(egbeVar.b().k), "OAuth authentication failed because account type did not match the @GcoreAccountType that was bound, @GcoreAccountType: %s, account: %s", egbeVar, ejwiVar3);
                            String strE = egejVar3.e(egbeVar.b());
                            if (strE != null) {
                                return new esoo(strE, "google");
                            }
                            throw new IllegalStateException("Attempting to get context for unrecognized account type: ".concat(String.valueOf(egbeVar.b().k)));
                        }
                        String str = egbeVar.b().d;
                        String str2 = egbeVar.b().k;
                        int length = str2.length();
                        boolean z = false;
                        int iCharCount = 0;
                        while (true) {
                            if (iCharCount >= length) {
                                z = true;
                                break;
                            }
                            int iCodePointAt = str2.codePointAt(iCharCount);
                            if (!Character.isWhitespace(iCodePointAt)) {
                                break;
                            }
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                        ejwl.b(!z, "Custom AuthContext type must not be empty");
                        ejwl.f(!str2.equals("google"), "Custom AuthContext type must not be '%s'", "google");
                        ejwl.f(!str2.equals("pseudonymous"), "Custom AuthContext type must not be '%s'", "pseudonymous");
                        ejwl.f(!str2.equals("incognito"), "Custom AuthContext type must not be '%s'", "incognito");
                        return new esoo(str, str2);
                    }
                }, eoqg.a);
            }
        }, eoqg.a);
    }
}
