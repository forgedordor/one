package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class divf implements divg {
    public final String a;
    public final dktq b;
    public final dktq c;
    public final String d;
    public final List e;
    public final dkts f;
    public final boolean g;
    public final fdae h;
    public final int i;
    private final boolean j;
    private final boolean k;

    public divf(String str, dktq dktqVar, dktq dktqVar2, String str2, List list, dkts dktsVar, boolean z, int i, fdae fdaeVar) {
        str.getClass();
        list.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = str;
        this.b = dktqVar;
        this.c = dktqVar2;
        this.d = str2;
        this.e = list;
        this.f = dktsVar;
        this.g = z;
        this.j = false;
        this.i = i;
        this.k = true;
        this.h = fdaeVar;
    }

    @Override // defpackage.divg
    public final divg a(fdae fdaeVar) {
        return new divf(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.i, fdaeVar);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.h;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof divf)) {
            return false;
        }
        divf divfVar = (divf) obj;
        if (!fdbq.f(this.a, divfVar.a) || !fdbq.f(this.b, divfVar.b) || !fdbq.f(this.c, divfVar.c) || !fdbq.f(this.d, divfVar.d) || !fdbq.f(this.e, divfVar.e) || !fdbq.f(this.f, divfVar.f) || this.g != divfVar.g) {
            return false;
        }
        boolean z = divfVar.j;
        if (this.i != divfVar.i) {
            return false;
        }
        boolean z2 = divfVar.k;
        return fdbq.f(this.h, divfVar.h);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dktq dktqVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (dktqVar == null ? 0 : dktqVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31;
        dkts dktsVar = this.f;
        return ((((((((((iHashCode3 + (dktsVar == null ? 0 : ((dktr) dktsVar).a)) * 31) + dive.a(this.g)) * 31) + dive.a(false)) * 31) + this.i) * 31) + dive.a(true)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptIn(title=");
        sb.append(this.a);
        sb.append(", confirmButton=");
        sb.append(this.b);
        sb.append(", denyButton=");
        sb.append(this.c);
        sb.append(", body=");
        sb.append(this.d);
        sb.append(", bodyAnnotations=");
        sb.append(this.e);
        sb.append(", illustration=");
        sb.append(this.f);
        sb.append(", showCloseButton=");
        sb.append(this.g);
        sb.append(", useEqualButtons=false, buttonLayout=");
        int i = this.i;
        sb.append((Object) (i != 1 ? i != 2 ? GeneralPurposeRichCardLayoutInfo.ORIENTATION_VERTICAL : "HORIZONTAL_END" : "HORIZONTAL_EDGES"));
        sb.append(", includeScrim=true, onDismiss=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ divf(java.lang.String r13, defpackage.dktq r14, defpackage.dktq r15, java.lang.String r16, java.util.List r17, defpackage.dkts r18, int r19, defpackage.fdae r20, int r21) {
        /*
            r12 = this;
            r0 = r21
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
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r9 = r1
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L24
            r1 = 3
            r10 = r1
            goto L26
        L24:
            r10 = r19
        L26:
            r1 = r0 & 8
            r0 = r0 & 4
            if (r1 == 0) goto L2e
            r6 = r2
            goto L30
        L2e:
            r6 = r16
        L30:
            if (r0 == 0) goto L39
            r5 = r2
            r3 = r13
            r4 = r14
            r11 = r20
            r2 = r12
            goto L3f
        L39:
            r5 = r15
            r2 = r12
            r3 = r13
            r4 = r14
            r11 = r20
        L3f:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.divf.<init>(java.lang.String, dktq, dktq, java.lang.String, java.util.List, dkts, int, fdae, int):void");
    }
}
