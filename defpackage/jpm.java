package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpm extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdci b;
    final /* synthetic */ hqq c;
    final /* synthetic */ lvj d;
    final /* synthetic */ jpn e;
    final /* synthetic */ View f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpm(fdci fdciVar, hqq hqqVar, lvj lvjVar, jpn jpnVar, View view, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdciVar;
        this.c = hqqVar;
        this.d = lvjVar;
        this.e = jpnVar;
        this.f = view;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jpm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [fdlr] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdlr fdlrVarD;
        fdlr fdlrVar;
        fdvc fdvcVar;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.a;
        try {
            if (r1 != 0) {
                fdlrVar = (fdlr) this.g;
                fctl.b(obj);
            } else {
                fctl.b(obj);
                fdjx fdjxVar = (fdjx) this.g;
                r1 = 0;
                r1 = 0;
                jnp jnpVar = (jnp) this.b.a;
                if (jnpVar != null) {
                    Context applicationContext = this.f.getContext().getApplicationContext();
                    Map map = jpq.a;
                    synchronized (map) {
                        Object obj2 = map.get(applicationContext);
                        Object obj3 = obj2;
                        if (obj2 == null) {
                            ContentResolver contentResolver = applicationContext.getContentResolver();
                            Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                            fdoa fdoaVarA = fdod.a(-1, 0, 6);
                            fdvc fdvcVarB = fdtg.b(new fdui(new jpo(contentResolver, uriFor, new jpp(fdoaVarA, laf.a(Looper.getMainLooper())), fdoaVarA, applicationContext, null)), fdjy.c(), fdur.a(0L, 3), Float.valueOf(Settings.Global.getFloat(applicationContext.getContentResolver(), "animator_duration_scale", 1.0f)));
                            map.put(applicationContext, fdvcVarB);
                            obj3 = fdvcVarB;
                        }
                        fdvcVar = (fdvc) obj3;
                    }
                    jnpVar.b(((Number) fdvcVar.c()).floatValue());
                    fdlrVarD = fdil.d(fdjxVar, null, null, new jpl(fdvcVar, jnpVar, null), 3);
                } else {
                    fdlrVarD = null;
                }
                try {
                    hqq hqqVar = this.c;
                    this.g = fdlrVarD;
                    this.a = 1;
                    Object objA = fdin.a(hqqVar.c, new hqn(hqqVar, new hqp(hqqVar, null), hos.a(u()), null), this);
                    fcyl fcylVar2 = fcyl.a;
                    Object obj4 = objA;
                    if (objA != fcylVar2) {
                        obj4 = fctx.a;
                    }
                    if (obj4 != fcylVar2) {
                        obj4 = fctx.a;
                    }
                    if (obj4 == fcylVar) {
                        return fcylVar;
                    }
                    fdlrVar = fdlrVarD;
                } catch (Throwable th) {
                    th = th;
                    r1 = fdlrVarD;
                    Throwable th2 = th;
                    if (r1 != 0) {
                        r1.t(null);
                    }
                    this.d.P().d(this.e);
                    throw th2;
                }
            }
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            this.d.P().d(this.e);
            return fctx.a;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        jpm jpmVar = new jpm(this.b, this.c, this.d, this.e, this.f, fcxyVar);
        jpmVar.g = obj;
        return jpmVar;
    }
}
