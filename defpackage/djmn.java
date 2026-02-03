package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djmn implements djmy {
    public final String a;
    public final List b;
    public final djrr c;
    public final String d;
    public final List e;
    public final djvp f;
    public final dktq g;
    public final dktq h;
    public final fdae i;

    public djmn(String str, List list, djrr djrrVar, String str2, List list2, djvp djvpVar, dktq dktqVar, dktq dktqVar2, fdae fdaeVar) {
        list.getClass();
        list2.getClass();
        fdaeVar.getClass();
        this.a = str;
        this.b = list;
        this.c = djrrVar;
        this.d = str2;
        this.e = list2;
        this.f = djvpVar;
        this.g = dktqVar;
        this.h = dktqVar2;
        this.i = fdaeVar;
    }

    public static /* synthetic */ djmn b(djmn djmnVar, String str, List list, String str2, dktq dktqVar, dktq dktqVar2, fdae fdaeVar, int i) {
        if ((i & 1) != 0) {
            str = djmnVar.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            list = djmnVar.b;
        }
        List list2 = list;
        djrr djrrVar = (i & 4) != 0 ? djmnVar.c : null;
        String str4 = (i & 8) != 0 ? djmnVar.d : str2;
        List list3 = (i & 16) != 0 ? djmnVar.e : null;
        djvp djvpVar = (i & 32) != 0 ? djmnVar.f : null;
        dktq dktqVar3 = (i & 64) != 0 ? djmnVar.g : dktqVar;
        dktq dktqVar4 = (i & 128) != 0 ? djmnVar.h : dktqVar2;
        fdae fdaeVar2 = (i & 256) != 0 ? djmnVar.i : fdaeVar;
        str3.getClass();
        list2.getClass();
        list3.getClass();
        fdaeVar2.getClass();
        return new djmn(str3, list2, djrrVar, str4, list3, djvpVar, dktqVar3, dktqVar4, fdaeVar2);
    }

    @Override // defpackage.djmy
    public final /* synthetic */ djmy a(boolean z, fdae fdaeVar) {
        return djmg.a(this, z, fdaeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djmn)) {
            return false;
        }
        djmn djmnVar = (djmn) obj;
        return fdbq.f(this.a, djmnVar.a) && fdbq.f(this.b, djmnVar.b) && this.c == djmnVar.c && fdbq.f(this.d, djmnVar.d) && fdbq.f(this.e, djmnVar.e) && fdbq.f(this.f, djmnVar.f) && fdbq.f(this.g, djmnVar.g) && fdbq.f(this.h, djmnVar.h) && fdbq.f(this.i, djmnVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        djrr djrrVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (djrrVar == null ? 0 : djrrVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31;
        djvp djvpVar = this.f;
        int iHashCode4 = (iHashCode3 + (djvpVar == null ? 0 : djvpVar.hashCode())) * 31;
        dktq dktqVar = this.g;
        int iHashCode5 = (iHashCode4 + (dktqVar == null ? 0 : dktqVar.hashCode())) * 31;
        dktq dktqVar2 = this.h;
        return ((iHashCode5 + (dktqVar2 != null ? dktqVar2.hashCode() : 0)) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "Option(title=" + this.a + ", items=" + this.b + ", icon=" + this.c + ", body=" + this.d + ", bodyAnnotations=" + this.e + ", footerItem=" + this.f + ", confirmButton=" + this.g + ", dismissButton=" + this.h + ", onDismissRequest=" + this.i + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ djmn(java.lang.String r13, java.util.List r14, defpackage.djrr r15, java.lang.String r16, java.util.List r17, defpackage.djvp r18, defpackage.dktq r19, defpackage.dktq r20, defpackage.fdae r21, int r22) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 16
            if (r1 == 0) goto La
            fcvo r1 = defpackage.fcvo.a
            r7 = r1
            goto Lc
        La:
            r7 = r17
        Lc:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L13
            r8 = r2
            goto L15
        L13:
            r8 = r18
        L15:
            r1 = r0 & 64
            if (r1 == 0) goto L1b
            r9 = r2
            goto L1d
        L1b:
            r9 = r19
        L1d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L23
            r10 = r2
            goto L25
        L23:
            r10 = r20
        L25:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L30
            djmm r1 = new djmm
            r1.<init>()
            r11 = r1
            goto L32
        L30:
            r11 = r21
        L32:
            r1 = r0 & 8
            r0 = r0 & 4
            if (r1 == 0) goto L3a
            r6 = r2
            goto L3c
        L3a:
            r6 = r16
        L3c:
            if (r0 == 0) goto L43
            r5 = r2
            r3 = r13
            r4 = r14
            r2 = r12
            goto L47
        L43:
            r5 = r15
            r2 = r12
            r3 = r13
            r4 = r14
        L47:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djmn.<init>(java.lang.String, java.util.List, djrr, java.lang.String, java.util.List, djvp, dktq, dktq, fdae, int):void");
    }
}
