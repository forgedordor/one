package defpackage;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpw {
    public static final cpw a = new cpw(Collections.EMPTY_LIST);
    public static final cpw b = new cpw(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
    public static final cpw c;
    public static final cpw d;
    public static final cpw e;
    private final HashSet f;

    static {
        new cpw(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class));
        c = new cpw(Arrays.asList(ForegroundCarColorSpan.class));
        d = new cpw(Arrays.asList(DistanceSpan.class, DurationSpan.class));
        e = new cpw(Arrays.asList(DistanceSpan.class, DurationSpan.class, CarIconSpan.class));
        new cpw(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
        new cpw(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));
    }

    private cpw(List list) {
        this.f = new HashSet(list);
    }

    private final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.f.contains(cls)) {
                throw new IllegalArgumentException("CarSpan type is not allowed: ".concat(String.valueOf(cls.getSimpleName())));
            }
        }
    }

    public final void a(CarText carText) {
        b(carText.getSpans());
        Iterator<List<CarText.SpanWrapper>> it = carText.getSpansForVariants().iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
