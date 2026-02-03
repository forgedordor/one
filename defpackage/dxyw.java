package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import j$.util.DesugarCollections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxyw implements dxyj {
    public static final Map a = DesugarCollections.synchronizedMap(new csq());
    public static final Map b = DesugarCollections.synchronizedMap(new csq());
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final ComponentCallbacks2 d = new dxym();
    private final Executor e;
    private final dyvg f;
    private final dxxk g;

    public dxyw(Context context, ExecutorService executorService, dxxk dxxkVar, dyvi dyviVar) {
        dyvi dyviVar2;
        dyvc dyvcVar;
        dyvk dyvkVar = new dyvk(context);
        dyuz dyuzVar = new dyuz();
        dyuzVar.b(new dyvf[0]);
        if (dyviVar == null) {
            throw new NullPointerException("Null imageRetriever");
        }
        dyuzVar.a = dyviVar;
        dyuzVar.d = new dyvc();
        dyuzVar.b = new dxyl(dyvkVar, dxxkVar);
        dyuzVar.b(dyvf.a);
        dyvi dyviVar3 = dyuzVar.a;
        if (dyviVar3 != null && (dyviVar2 = dyuzVar.b) != null && (dyvcVar = dyuzVar.d) != null) {
            dyva dyvaVar = new dyva(dyviVar3, dyviVar2, dyvcVar, dyuzVar.c);
            this.e = executorService;
            this.f = dyvaVar;
            this.g = dxxkVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (dyuzVar.a == null) {
            sb.append(" imageRetriever");
        }
        if (dyuzVar.b == null) {
            sb.append(" secondaryImageRetriever");
        }
        if (dyuzVar.d == null) {
            sb.append(" defaultImageRetriever");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static void b(ImageView imageView, dxyv dxyvVar) {
        ecem.c();
        dxyv dxyvVar2 = (dxyv) imageView.getTag(R.id.tag_account_image_request);
        if (dxyvVar2 != null) {
            dxyvVar2.e = true;
        }
        imageView.setTag(R.id.tag_account_image_request, dxyvVar);
    }

    @Override // defpackage.dxyj
    public final void a(Object obj, ImageView imageView) {
        ecem.c();
        Context context = imageView.getContext();
        if (!c.getAndSet(true)) {
            context.getApplicationContext().registerComponentCallbacks(d);
        }
        dyvg dyvgVar = this.f;
        Executor executor = this.e;
        final dxyv dxyvVar = new dxyv(obj, dyvgVar, imageView, executor, this.g);
        b(imageView, dxyvVar);
        executor.execute(new Runnable() { // from class: dxyk
            @Override // java.lang.Runnable
            public final void run() {
                String string;
                Map map = dxyw.a;
                final dxyv dxyvVar2 = dxyvVar;
                final ImageView imageView2 = (ImageView) dxyvVar2.a.get();
                if (dxyvVar2.e || imageView2 == null) {
                    return;
                }
                if (dxyvVar2.b == null) {
                    try {
                        dxyvVar2.b(imageView2.getContext());
                        return;
                    } catch (IllegalStateException unused) {
                        dyrf.a(new Runnable() { // from class: dxys
                            @Override // java.lang.Runnable
                            public final void run() {
                                dxyvVar2.b(imageView2.getContext());
                            }
                        });
                        return;
                    }
                }
                Integer num = (Integer) dyvd.a(imageView2).e(0);
                final int iIntValue = num.intValue();
                dxxk dxxkVar = dxyvVar2.d;
                Object obj2 = dxyvVar2.b;
                if (obj2 == null) {
                    string = "null";
                } else {
                    StringBuilder sb = new StringBuilder(dxxkVar.b(obj2));
                    String strD = dxxkVar.d(obj2);
                    if (strD != null) {
                        sb.append(" ");
                        sb.append(strD);
                    }
                    string = sb.toString();
                }
                final String str = String.format(Locale.ROOT, "%s %s", string, num);
                Drawable drawable = (Drawable) dxyw.a.get(str);
                if (drawable != null) {
                    dxyvVar2.e(drawable, true);
                    return;
                }
                dyvg dyvgVar2 = dxyvVar2.c;
                final Drawable drawable2 = (Drawable) dxyw.b.get(str);
                if (drawable2 != null) {
                    dxyvVar2.e(drawable2, false);
                }
                dyva dyvaVar = (dyva) dyvgVar2;
                final dyvi dyviVar = dyvaVar.b;
                dyvi dyviVar2 = dyvaVar.a;
                dyvh dyvhVar = new dyvh() { // from class: dxyt
                    @Override // defpackage.dyvh
                    public final void a(final Bitmap bitmap) {
                        final dxyv dxyvVar3 = dxyvVar2;
                        if (dxyvVar3.e) {
                            return;
                        }
                        final String str2 = str;
                        if (bitmap != null) {
                            dxyvVar3.d(new Runnable() { // from class: dxyo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dxyv dxyvVar4 = dxyvVar3;
                                    BitmapDrawable bitmapDrawable = new BitmapDrawable(dxyvVar4.a(bitmap));
                                    Map map2 = dxyw.a;
                                    String str3 = str2;
                                    map2.put(str3, bitmapDrawable);
                                    dxyw.b.remove(str3);
                                    dxyvVar4.e(bitmapDrawable, true);
                                }
                            });
                            return;
                        }
                        Drawable drawable3 = drawable2;
                        if (drawable3 != null) {
                            dxyvVar3.e(drawable3, true);
                        } else {
                            if (!dyvk.b(dyvl.g(dxyvVar3.b, dxyvVar3.d))) {
                                dyrf.a(new Runnable() { // from class: dxyq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        dxyvVar3.c();
                                    }
                                });
                                return;
                            }
                            final int i = iIntValue;
                            final dyvi dyviVar3 = dyviVar;
                            dxyvVar3.d(new Runnable() { // from class: dxyp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final dxyv dxyvVar4 = dxyvVar3;
                                    final String str3 = str2;
                                    dyvh dyvhVar2 = new dyvh() { // from class: dxyr
                                        @Override // defpackage.dyvh
                                        public final void a(Bitmap bitmap2) {
                                            dxyv dxyvVar5 = dxyvVar4;
                                            BitmapDrawable bitmapDrawable = new BitmapDrawable(dxyvVar5.a(bitmap2));
                                            dxyw.b.put(str3, bitmapDrawable);
                                            dxyvVar5.e(bitmapDrawable, true);
                                        }
                                    };
                                    dxyl dxylVar = (dxyl) dyviVar3;
                                    Object obj3 = dxyvVar4.b;
                                    dxxk dxxkVar2 = dxylVar.b;
                                    Map map2 = dxyw.a;
                                    dyvhVar2.a(dxylVar.a.a(dyvl.g(obj3, dxxkVar2), i));
                                }
                            });
                        }
                    }
                };
                egbe egbeVar = (egbe) obj2;
                String str2 = egbeVar.b().h;
                String str3 = egbeVar.b().d;
                acbb acbbVar = (acbb) dyviVar2;
                dynm dynmVar = new dynm(acbbVar.a, acbbVar.b);
                String str4 = egbeVar.b().g;
                if (str4 == null) {
                    throw new NullPointerException("Null accountName");
                }
                dynj dynjVar = new dynj(str3, str4, str2);
                eork.r(dynmVar.b.g(dynjVar.a(), dyyk.b(dynmVar.a, iIntValue)), new dynl(dyvhVar), eoqg.a);
            }
        });
    }
}
