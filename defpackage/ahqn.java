package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqn {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final fctc g;
    public final fctc h;
    public final fctc i;

    public ahqn(ParticipantsTable.BindData bindData) {
        String strR = bindData.R();
        strR.getClass();
        int iR = bindData.r();
        String strT = bindData.T();
        String strO = bindData.O();
        String strQ = bindData.Q();
        String strP = bindData.P();
        this.a = strR;
        this.b = iR;
        this.c = strT;
        this.d = strO;
        this.e = strQ;
        this.f = strP;
        this.g = fctd.a(new fdae() { // from class: ahqk
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(this.a.b != -2);
            }
        });
        this.h = fctd.a(new fdae() { // from class: ahql
            @Override // defpackage.fdae
            public final Object invoke() {
                ahqn ahqnVar = this.a;
                String str = ahqnVar.e;
                String str2 = null;
                if (str != null) {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        return str;
                    }
                }
                String str3 = ahqnVar.f;
                if (str3 == null || str3.length() <= 0) {
                    str3 = null;
                }
                if (str3 != null) {
                    return str3;
                }
                String str4 = ahqnVar.d;
                if (str4 != null && str4.length() > 0) {
                    str2 = str4;
                }
                if (str2 != null) {
                    return str2;
                }
                String str5 = ahqnVar.c;
                return str5 == null ? "" : str5;
            }
        });
        this.i = fctd.a(new fdae() { // from class: ahqm
            @Override // defpackage.fdae
            public final Object invoke() {
                ahri ahriVar = (ahri) ahrj.a.createBuilder();
                ahriVar.getClass();
                ahqn ahqnVar = this.a;
                if (((Boolean) ahqnVar.g.a()).booleanValue()) {
                    ahrk.c(3, ahriVar);
                } else {
                    ahrx ahrxVar = (ahrx) ahry.a.createBuilder();
                    ahrxVar.getClass();
                    String str = (String) ahqnVar.h.a();
                    str.getClass();
                    ahrxVar.copyOnWrite();
                    ((ahry) ahrxVar.instance).b = str;
                    String str2 = ahqnVar.a;
                    ahrxVar.copyOnWrite();
                    ((ahry) ahrxVar.instance).c = str2;
                    evsn evsnVarBuild = ahrxVar.build();
                    evsnVarBuild.getClass();
                    ahriVar.copyOnWrite();
                    ahrj ahrjVar = (ahrj) ahriVar.instance;
                    ahrjVar.c = (ahry) evsnVarBuild;
                    ahrjVar.b = 3;
                }
                return ahrk.a(ahriVar);
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahqn)) {
            return false;
        }
        ahqn ahqnVar = (ahqn) obj;
        return fdbq.f(this.a, ahqnVar.a) && this.b == ahqnVar.b && fdbq.f(this.c, ahqnVar.c) && fdbq.f(this.d, ahqnVar.d) && fdbq.f(this.e, ahqnVar.e) && fdbq.f(this.f, ahqnVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.c;
        int iHashCode2 = (((iHashCode + this.b) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "Participant(id=" + this.a + ", subId=" + this.b + ", normalizedDestination=" + this.c + ", displayDestination=" + this.d + ", fullName=" + this.e + ", firstName=" + this.f + ")";
    }
}
