package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxua extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ LoadMessagesReceiver c;
    final /* synthetic */ File d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ boolean g;
    final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxua(boolean z, LoadMessagesReceiver loadMessagesReceiver, File file, int i, int i2, boolean z2, Context context, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = loadMessagesReceiver;
        this.d = file;
        this.e = i;
        this.f = i2;
        this.g = z2;
        this.h = context;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxua) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r10.i(r1, r2, r3, r9) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r3.h(r4, r5, r6, r7, r9) == r0) goto L12;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            r2 = 1
            defpackage.fctl.b(r10)
            if (r1 == 0) goto Lc
            r8 = r9
            goto L37
        Lc:
            boolean r10 = r9.b
            if (r10 == 0) goto L24
            com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver r3 = r9.c
            java.io.File r4 = r9.d
            int r5 = r9.e
            int r6 = r9.f
            boolean r7 = r9.g
            r9.a = r2
            r8 = r9
            java.lang.Object r10 = r3.h(r4, r5, r6, r7, r8)
            if (r10 != r0) goto L37
            goto L36
        L24:
            r8 = r9
            com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver r10 = r8.c
            int r1 = r8.e
            android.content.Context r2 = r8.h
            boolean r3 = r8.g
            r4 = 2
            r8.a = r4
            java.lang.Object r10 = r10.i(r1, r2, r3, r9)
            if (r10 != r0) goto L37
        L36:
            return r0
        L37:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxua.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cxua(this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
