package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pto implements pst {
    public static volatile pto a;
    public static final ReentrantLock b = new ReentrantLock();
    public final Context c;
    public final CopyOnWriteArrayList d;
    public final ptg e;
    private final ptm f;

    public pto(Context context, final ptg ptgVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.c = context;
        this.e = ptgVar;
        final ptm ptmVar = new ptm(this);
        this.f = ptmVar;
        this.d = new CopyOnWriteArrayList();
        if (ptgVar != null) {
            int i = ptgVar.d.a;
            if (i == 1) {
                prm prmVar = ptgVar.c;
                ActivityEmbeddingComponent activityEmbeddingComponent = ptgVar.a;
                int i2 = fdcj.a;
                activityEmbeddingComponent.getClass().getMethod("setSplitInfoCallback", prmVar.b()).invoke(activityEmbeddingComponent, prmVar.c(new fdbi(List.class), new fdap() { // from class: ptb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        List list = (List) obj;
                        list.getClass();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (prn$$ExternalSyntheticApiModelOutline0.m$4(obj2)) {
                                arrayList.add(obj2);
                            }
                        }
                        ptg ptgVar2 = ptgVar;
                        ptj ptjVar = ptmVar;
                        ptgVar2.b.a(arrayList);
                        ptjVar.a();
                        return fctx.a;
                    }
                }));
            } else if (i >= 2 && i < 5) {
                ptgVar.a(ptmVar);
            } else if (i >= 5) {
                ptgVar.a(ptmVar);
                ptgVar.a.registerActivityStackCallback(new Executor() { // from class: ptc
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, new prx(ptmVar, ptgVar.b));
            }
        }
        new css((byte[]) null);
        new HashMap();
        fctd.a(new fdae() { // from class: ptl
            @Override // defpackage.fdae
            public final Object invoke() throws PackageManager.NameNotFoundException {
                pto ptoVar = this.a;
                if (ptoVar.e == null) {
                    return pwg.b;
                }
                if (Build.VERSION.SDK_INT < 31) {
                    return pwg.a;
                }
                Context context2 = ptoVar.c;
                try {
                    PackageManager.Property property = context2.getPackageManager().getProperty("android.window.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED", context2.getPackageName());
                    property.getClass();
                    return !property.isBoolean() ? pwg.c : property.getBoolean() ? pwg.a : pwg.b;
                } catch (PackageManager.NameNotFoundException | Exception unused) {
                    return pwg.c;
                }
            }
        });
    }

    @Override // defpackage.pst
    public final boolean a(Activity activity) {
        ptg ptgVar = this.e;
        if (ptgVar != null) {
            return ptgVar.a.isActivityEmbedded(activity);
        }
        return false;
    }
}
