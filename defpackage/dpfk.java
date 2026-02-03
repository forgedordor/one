package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfk extends fdcy {
    final /* synthetic */ dpfq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfk(Object obj, dpfq dpfqVar) {
        super(obj);
        this.a = dpfqVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        final fad fadVar = (fad) obj2;
        fadVar.getClass();
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: dpeh
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[RETURN] */
            @Override // android.widget.TextView.OnEditorActionListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onEditorAction(android.widget.TextView r4, int r5, android.view.KeyEvent r6) {
                /*
                    r3 = this;
                    dpeg r4 = new dpeg
                    r4.<init>()
                    fctc r4 = defpackage.fctd.a(r4)
                    fad r6 = r1
                    r0 = 0
                    r1 = 1
                    r2 = 0
                    switch(r5) {
                        case 2: goto L52;
                        case 3: goto L42;
                        case 4: goto L32;
                        case 5: goto L22;
                        case 6: goto L12;
                        case 7: goto L52;
                        default: goto L11;
                    }
                L11:
                    return r0
                L12:
                    fdap r5 = r6.b
                    if (r5 == 0) goto L1f
                    dpen r4 = defpackage.dpeo.a(r4)
                    r5.invoke(r4)
                    fctx r2 = defpackage.fctx.a
                L1f:
                    if (r2 == 0) goto L52
                    return r1
                L22:
                    fdap r5 = r6.c
                    if (r5 == 0) goto L2f
                    dpen r4 = defpackage.dpeo.a(r4)
                    r5.invoke(r4)
                    fctx r2 = defpackage.fctx.a
                L2f:
                    if (r2 == 0) goto L52
                    return r1
                L32:
                    fdap r5 = r6.e
                    if (r5 == 0) goto L3f
                    dpen r4 = defpackage.dpeo.a(r4)
                    r5.invoke(r4)
                    fctx r2 = defpackage.fctx.a
                L3f:
                    if (r2 == 0) goto L52
                    return r1
                L42:
                    fdap r5 = r6.d
                    if (r5 == 0) goto L4f
                    dpen r4 = defpackage.dpeo.a(r4)
                    r5.invoke(r4)
                    fctx r2 = defpackage.fctx.a
                L4f:
                    if (r2 == 0) goto L52
                    return r1
                L52:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dpeh.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
            }
        });
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
