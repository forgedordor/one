package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chol implements antg {
    private final fcsu a;
    private final fcsu b;
    private final ResolvedRecipient c;
    private final chpk d;
    private final antq e;
    private final chpc f;
    private final anue g;

    public chol(fcsu fcsuVar, chot chotVar, fcsu fcsuVar2, ResolvedRecipient resolvedRecipient, chpk chpkVar) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = resolvedRecipient;
        this.d = chpkVar;
        h(resolvedRecipient, chpkVar);
        this.f = e(resolvedRecipient, chpkVar);
        this.e = chpkVar == null ? null : chotVar.a(chpkVar);
        h(resolvedRecipient, null);
        e(resolvedRecipient, null);
        this.g = resolvedRecipient.F();
    }

    public static final boolean d(ResolvedRecipient resolvedRecipient) {
        String strA = chok.a(resolvedRecipient.b());
        if (strA.length() == 0) {
            return false;
        }
        String strT = cpbr.t(Uri.parse(strA));
        return (resolvedRecipient.p() == chpq.PROFILE_PEOPLE_SHARING_SOURCE || fdbq.f(strT, "d") || fdbq.f(strT, "l")) ? false : true;
    }

    private final chpc e(ResolvedRecipient resolvedRecipient, chpk chpkVar) {
        if (resolvedRecipient.o() == chpm.PREFER_CONTACT_PHOTO) {
            if (resolvedRecipient.d() != null) {
                return new chpc(resolvedRecipient.d(), chpq.PROFILE_CONTACT_SOURCE, false, 4);
            }
            if (d(resolvedRecipient)) {
                return new chpc(Uri.parse(chok.a(resolvedRecipient.b())), resolvedRecipient.p(), false, 4);
            }
            if (chpkVar != null) {
                chph chphVar = chpkVar.d;
                if (chphVar == null) {
                    chphVar = chph.a;
                }
                String str = chphVar.c;
                str.getClass();
                if (str.length() > 0) {
                    chph chphVar2 = chpkVar.d;
                    if (chphVar2 == null) {
                        chphVar2 = chph.a;
                    }
                    chphVar2.getClass();
                    return chpa.b(chphVar2);
                }
            } else {
                chpkVar = null;
            }
            if (chpkVar != null) {
                chpe chpeVar = chpkVar.c;
                if (chpeVar == null) {
                    chpeVar = chpe.a;
                }
                String str2 = chpeVar.e;
                str2.getClass();
                if (str2.length() > 0) {
                    cpbn cpbnVar = (cpbn) this.a.b();
                    chpe chpeVar2 = chpkVar.c;
                    if (chpeVar2 == null) {
                        chpeVar2 = chpe.a;
                    }
                    return new chpc(cpbnVar.d(chpeVar2.e, resolvedRecipient.g(), resolvedRecipient.J()), chpq.PROFILE_UNSPECIFIED_SOURCE, false, 4);
                }
            }
            return new chpc(null, chpq.PROFILE_UNSPECIFIED_SOURCE, false, 4);
        }
        if (chpkVar != null) {
            chph chphVar3 = chpkVar.d;
            if (chphVar3 == null) {
                chphVar3 = chph.a;
            }
            String str3 = chphVar3.c;
            str3.getClass();
            if (str3.length() > 0) {
                chph chphVar4 = chpkVar.d;
                if (chphVar4 == null) {
                    chphVar4 = chph.a;
                }
                chphVar4.getClass();
                return chpa.b(chphVar4);
            }
        } else {
            chpkVar = null;
        }
        if (resolvedRecipient.d() != null) {
            return new chpc(resolvedRecipient.d(), chpq.PROFILE_CONTACT_SOURCE, false, 4);
        }
        if (d(resolvedRecipient)) {
            return new chpc(Uri.parse(chok.a(resolvedRecipient.b())), resolvedRecipient.p(), false, 4);
        }
        if (chpkVar != null) {
            chpe chpeVar3 = chpkVar.c;
            if (chpeVar3 == null) {
                chpeVar3 = chpe.a;
            }
            String str4 = chpeVar3.e;
            str4.getClass();
            if (str4.length() > 0) {
                cpbn cpbnVar2 = (cpbn) this.a.b();
                chpe chpeVar4 = chpkVar.c;
                if (chpeVar4 == null) {
                    chpeVar4 = chpe.a;
                }
                return new chpc(cpbnVar2.d(chpeVar4.e, resolvedRecipient.g(), resolvedRecipient.J()), chpq.PROFILE_UNSPECIFIED_SOURCE, false, 4);
            }
        }
        return new chpc(null, chpq.PROFILE_UNSPECIFIED_SOURCE, false, 4);
    }

    private static final void h(ResolvedRecipient resolvedRecipient, chpk chpkVar) {
        String strX = resolvedRecipient.x(true);
        if (strX != null && strX.length() != 0 && !fdbq.f(strX, resolvedRecipient.g().o())) {
            new chpb(null, null, resolvedRecipient.w(), chpq.PROFILE_CONTACT_SOURCE, false, 19);
            return;
        }
        if (chpkVar != null) {
            chpe chpeVar = chpkVar.c;
            if (chpeVar == null) {
                chpeVar = chpe.a;
            }
            if (chpeVar != null) {
                chpa.a(chpeVar);
                return;
            }
        }
        new chpb(null, null, null, chpq.PROFILE_UNSPECIFIED_SOURCE, false, 23);
    }

    @Override // defpackage.antg
    public final antq a() {
        return this.e;
    }

    @Override // defpackage.antg
    public final ResolvedRecipient b() {
        return this.c;
    }

    @Override // defpackage.antg
    public final anue c() {
        return this.g;
    }

    @Override // defpackage.ants
    public final chpb f() {
        throw null;
    }

    @Override // defpackage.ants
    public final chpc g() {
        return this.f;
    }
}
