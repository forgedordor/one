package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbk extends rbi {
    public rbk(Class cls, Class cls2) {
        super(a.c(cls2, cls, "Failed to find any ModelLoaders for model: ", " and data: "));
    }

    public rbk(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public rbk(Object obj, List list) {
        super(a.H(obj, list, "Found ModelLoaders for model class: ", ", but none that handle this specific model instance: "));
    }
}
