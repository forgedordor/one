package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crfv extends fcyz implements fdat {
    int a;
    final /* synthetic */ crgd b;
    final /* synthetic */ ekfw c;
    final /* synthetic */ aioz d;
    final /* synthetic */ ezda e;
    final /* synthetic */ boolean f;
    final /* synthetic */ ejlu g;
    final /* synthetic */ MessageCoreData h;
    Object i;
    final /* synthetic */ crap j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crfv(fcxy fcxyVar, crgd crgdVar, ekfw ekfwVar, aioz aiozVar, crap crapVar, ezda ezdaVar, boolean z, ejlu ejluVar, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.b = crgdVar;
        this.c = ekfwVar;
        this.d = aiozVar;
        this.j = crapVar;
        this.e = ezdaVar;
        this.f = z;
        this.g = ejluVar;
        this.h = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crfv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [eieu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        aioz aiozVarA;
        ?? H;
        aioz aiozVar;
        Throwable th;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            H = this.i;
            aiozVar = (aioz) this.k;
            try {
                fctl.b(obj);
                H = H;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                try {
                    throw th;
                } catch (Throwable th3) {
                    try {
                        fczl.a(H, th);
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        aiozVarA = aiozVar;
                        this.c.h(crgd.k(7, aiozVarA.a()));
                        throw th;
                    }
                }
            }
        } else {
            fctl.b(obj);
            crgd crgdVar = this.b;
            aiozVarA = ((aioy) crgdVar.g.b()).a();
            try {
                H = eiiy.h("SmartSuggestionRequesterImpl#parseResponse");
                try {
                    fcyh fcyhVarA = eicg.a(crgdVar.c);
                    crfx crfxVar = new crfx(null, crgdVar, this.e, this.f, this.g, this.h, this.j);
                    this.k = aiozVarA;
                    this.i = H;
                    this.a = 1;
                    Object objA = fdin.a(fcyhVarA, crfxVar, this);
                    if (objA == fcylVar) {
                        return fcylVar;
                    }
                    aiozVar = aiozVarA;
                    obj = objA;
                    H = H;
                } catch (Throwable th5) {
                    th = th5;
                    aiozVar = aiozVarA;
                    th = th;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                this.c.h(crgd.k(7, aiozVarA.a()));
                throw th;
            }
        }
        crap crapVar = (crap) obj;
        try {
            fczl.a(H, null);
            ekfw ekfwVar = this.c;
            ekfwVar.h(crgd.k(7, aiozVar.a()));
            ekfwVar.h(crgd.k(3, this.d.a()));
            crap crapVar2 = this.j;
            ekgb ekgbVarG = ekfwVar.g();
            ekgbVarG.getClass();
            crapVar2.e = ekgbVarG;
            crapVar2.f = (byte) (crapVar2.f | 16);
            return crapVar.a();
        } catch (Throwable th7) {
            th = th7;
            aiozVarA = aiozVar;
            this.c.h(crgd.k(7, aiozVarA.a()));
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crfv crfvVar = new crfv(fcxyVar, this.b, this.c, this.d, this.j, this.e, this.f, this.g, this.h);
        crfvVar.k = obj;
        return crfvVar;
    }
}
