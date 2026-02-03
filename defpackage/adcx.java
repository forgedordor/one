package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcx implements adcz {
    public final Function a;
    private final Context b;
    private final Map c;
    private final Paint d;
    private addh e;
    private Drawable f;
    private float g;

    public adcx(Context context, addh addhVar, addh addhVar2, Function function) {
        ejwl.a(true);
        ejwl.a(true);
        this.b = context;
        this.e = addhVar;
        this.g = 0.0f;
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(eehg.d(context, R.attr.colorPrimary, "SwipeActionCallback"));
        this.a = function;
        HashMap map = new HashMap();
        this.c = map;
        map.put(addhVar, Optional.empty());
        map.put(addhVar2, Optional.empty());
    }

    @Override // defpackage.adcz
    public final void a() {
        Map map = this.c;
        if (map.containsValue(Optional.empty())) {
            for (addh addhVar : map.keySet()) {
                Drawable drawableB = addhVar.b();
                addhVar.c(drawableB, eehg.d(this.b, R.attr.colorOnPrimary, "SwipeActionCallback"));
                map.put(addhVar, Optional.of(drawableB));
            }
            c(this.e);
        }
    }

    @Override // defpackage.adcz
    public final void b(Canvas canvas, RecyclerView recyclerView, wv wvVar, float f, boolean z) {
        adco adcoVar = new adco();
        adcoVar.a = this.b;
        adcoVar.f(this.e);
        adcoVar.e(this.f);
        adcoVar.b = this.d;
        adcoVar.b(canvas);
        adcoVar.c = recyclerView;
        adcoVar.d = wvVar;
        adcoVar.c(f);
        adcoVar.d(this.g);
        adcoVar.g(z);
        adcoVar.h();
        this.g = adcy.a(adcoVar.a());
    }

    public final void c(addh addhVar) {
        Map map = this.c;
        ejwl.a(map.containsKey(addhVar));
        Optional optional = (Optional) map.get(addhVar);
        if (optional == null || !optional.isPresent()) {
            return;
        }
        this.e = addhVar;
        this.f = (Drawable) optional.get();
    }
}
