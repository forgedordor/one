package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlls implements dkfe, dkff {
    public final String a;
    public final djrr b;
    public final List c;
    public final fdae d;
    private final String e;

    public dlls(String str, String str2, djrr djrrVar, List list, fdae fdaeVar) {
        str2.getClass();
        this.e = str;
        this.a = str2;
        this.b = djrrVar;
        this.c = list;
        this.d = fdaeVar;
    }

    @Override // defpackage.dkfe
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlls)) {
            return false;
        }
        dlls dllsVar = (dlls) obj;
        return fdbq.f(this.e, dllsVar.e) && fdbq.f(this.a, dllsVar.a) && this.b == dllsVar.b && fdbq.f(this.c, dllsVar.c) && fdbq.f(this.d, dllsVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() * 31) + this.a.hashCode();
        djrr djrrVar = this.b;
        int iHashCode2 = ((((iHashCode * 31) + (djrrVar == null ? 0 : djrrVar.hashCode())) * 31) + this.c.hashCode()) * 31;
        fdae fdaeVar = this.d;
        return iHashCode2 + (fdaeVar != null ? fdaeVar.hashCode() : 0);
    }

    public final String toString() {
        return "ToolstoneUiData(id=" + this.e + ", text=" + this.a + ", icon=" + this.b + ", annotations=" + this.c + ", onClose=" + this.d + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ dlls(java.lang.String r7, java.lang.String r8, defpackage.djrr r9, java.util.List r10, defpackage.fdae r11, int r12) {
        /*
            r6 = this;
            r0 = r12 & 8
            if (r0 == 0) goto L6
            fcvo r10 = defpackage.fcvo.a
        L6:
            r4 = r10
            r10 = r12 & 4
            r0 = 0
            if (r10 == 0) goto Le
            r3 = r0
            goto Lf
        Le:
            r3 = r9
        Lf:
            r9 = r12 & 16
            if (r9 == 0) goto L18
            r5 = r0
            r1 = r7
            r2 = r8
            r0 = r6
            goto L1c
        L18:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
        L1c:
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlls.<init>(java.lang.String, java.lang.String, djrr, java.util.List, fdae, int):void");
    }
}
