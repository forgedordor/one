package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmvh extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ List d;
    final /* synthetic */ dmvi e;
    final /* synthetic */ dmbr f;
    final /* synthetic */ dmvc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmvh(List list, dmvi dmviVar, dmbr dmbrVar, dmvc dmvcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = list;
        this.e = dmviVar;
        this.f = dmbrVar;
        this.g = dmvcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmvh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006a -> B:8:0x0024). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006d -> B:8:0x0024). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.c
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto Lf
            java.lang.Object r1 = r11.a
            defpackage.fctl.b(r12)
            goto L24
        Lf:
            java.lang.Object r1 = r11.b
            java.lang.Object r3 = r11.a
            defpackage.fctl.b(r12)
            r9 = r3
            r3 = r1
            r1 = r9
            r9 = r11
            goto L52
        L1b:
            defpackage.fctl.b(r12)
            java.util.List r12 = r11.d
            java.util.Iterator r1 = r12.iterator()
        L24:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L8f
            java.lang.Object r12 = r1.next()
            fcti r12 = (defpackage.fcti) r12
            java.lang.Object r3 = r12.a
            r5 = r3
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.Object r12 = r12.b
            dnhn r12 = (defpackage.dnhn) r12
            dmvi r3 = r11.e
            dmbr r6 = r11.f
            r11.a = r1
            r11.b = r12
            r11.c = r2
            dlus r4 = r3.c
            r7 = 1
            dlur r8 = defpackage.dlur.a
            r9 = r11
            java.lang.Object r3 = r4.c(r5, r6, r7, r8, r9)
            if (r3 == r0) goto L8e
            r10 = r3
            r3 = r12
            r12 = r10
        L52:
            boolean r4 = r12 instanceof defpackage.dojv
            r5 = 0
            if (r4 == 0) goto L5a
            dojv r12 = (defpackage.dojv) r12
            goto L5b
        L5a:
            r12 = r5
        L5b:
            if (r12 == 0) goto L6d
            dmvc r4 = r9.g
            r9.a = r1
            r9.b = r5
            r5 = 2
            r9.c = r5
            java.lang.Object r12 = r4.a(r12, r3, r11)
            if (r12 == r0) goto L8e
            goto L24
        L6d:
            ekrg r12 = defpackage.dmvi.a
            ekrw r12 = r12.i()
            ekrd r12 = (defpackage.ekrd) r12
            eksk r3 = defpackage.eksk.MEDIUM
            r12.Z(r3)
            r3 = 187(0xbb, float:2.62E-43)
            java.lang.String r4 = "GalleryUiAdapter.kt"
            java.lang.String r5 = "com/google/android/libraries/compose/cameragallery/ui/gallery/GalleryUiAdapter$handleGallerySelection$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r12 = r12.h(r5, r6, r3, r4)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r3 = "System content picker media was not resolved as local visual media."
            r12.q(r3)
            goto L24
        L8e:
            return r0
        L8f:
            r9 = r11
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmvh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmvh(this.d, this.e, this.f, this.g, fcxyVar);
    }
}
