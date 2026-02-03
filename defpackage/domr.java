package defpackage;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class domr implements domi {
    public final Context a;
    public final dndk b;
    private final domb c;
    private final domd d;
    private final domu e;
    private final fdjx f;
    private final fctc g;

    public domr(Context context, dndk dndkVar, domb dombVar, domd domdVar, domu domuVar, fdjx fdjxVar, final fcsu fcsuVar) {
        context.getClass();
        dndkVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.a = context;
        this.b = dndkVar;
        this.c = dombVar;
        this.d = domdVar;
        this.e = domuVar;
        this.f = fdjxVar;
        this.g = fctd.a(new fdae() { // from class: domj
            @Override // defpackage.fdae
            public final Object invoke() {
                Object objB = fcsuVar.b();
                objB.getClass();
                Optional optional = (Optional) objB;
                return (dluu) (optional.isPresent() ? optional.get() : new dluu(null));
            }
        });
    }

    @Override // defpackage.domi
    public final /* synthetic */ Object a(domg domgVar, Uri uri, fcxy fcxyVar) {
        if (!dngm.b(domgVar.b) || domgVar.c.compareTo(Duration.ZERO) <= 0) {
            domgVar = null;
        }
        return domgVar == null ? d(uri, fcxyVar) : domgVar;
    }

    @Override // defpackage.domi
    public final Object b(final Uri uri, fcxy fcxyVar) {
        return this.c.b(new fdap() { // from class: domk
            @Override // defpackage.fdap
            public final Object invoke(Object obj) throws SecurityException, IllegalArgumentException {
                MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) obj;
                mediaMetadataRetriever.getClass();
                mediaMetadataRetriever.setDataSource(this.a.a, uri);
                return fctx.a;
            }
        }, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.domi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.net.Uri r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.domm
            if (r0 == 0) goto L13
            r0 = r10
            domm r0 = (defpackage.domm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            domm r0 = new domm
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L47
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            defpackage.fctl.b(r10)
            return r10
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.fctl.b(r10)
            return r10
        L3d:
            java.lang.Object r9 = r0.a
            defpackage.fctl.b(r10)
            goto L79
        L43:
            defpackage.fctl.b(r10)
            return r10
        L47:
            defpackage.fctl.b(r10)
            dluu r10 = r8.e()
            boolean r10 = r10.a
            if (r10 == 0) goto L63
            domd r10 = r8.d
            domn r2 = new domn
            r2.<init>(r8, r9, r7)
            r0.d = r6
            java.lang.Object r9 = r10.a(r2, r0)
            if (r9 != r1) goto L62
            goto La9
        L62:
            return r9
        L63:
            r0.a = r9
            r0.d = r5
            fdjx r10 = r8.f
            fcyh r10 = r10.hE()
            domq r2 = new domq
            r2.<init>(r9, r8, r7)
            java.lang.Object r10 = defpackage.fdin.a(r10, r2, r0)
            if (r10 != r1) goto L79
            goto La9
        L79:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L96
            r0.a = r7
            r0.d = r4
            domd r10 = r8.d
            domp r2 = new domp
            android.net.Uri r9 = (android.net.Uri) r9
            r2.<init>(r8, r9, r7)
            java.lang.Object r9 = r10.a(r2, r0)
            if (r9 != r1) goto L95
            goto La9
        L95:
            return r9
        L96:
            domd r10 = r8.d
            domo r2 = new domo
            android.net.Uri r9 = (android.net.Uri) r9
            r2.<init>(r8, r9, r7)
            r0.a = r7
            r0.d = r3
            java.lang.Object r9 = r10.a(r2, r0)
            if (r9 != r1) goto Laa
        La9:
            return r1
        Laa:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.domr.c(android.net.Uri, fcxy):java.lang.Object");
    }

    @Override // defpackage.domi
    public final Object d(final Uri uri, fcxy fcxyVar) {
        return this.e.b(new fdap() { // from class: doml
            @Override // defpackage.fdap
            public final Object invoke(Object obj) throws SecurityException, IllegalArgumentException {
                MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) obj;
                mediaMetadataRetriever.getClass();
                mediaMetadataRetriever.setDataSource(this.a.a, uri);
                return fctx.a;
            }
        }, fcxyVar);
    }

    public final dluu e() {
        return (dluu) this.g.a();
    }
}
