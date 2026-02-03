package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azs implements bji {
    final List a;

    public azs(List list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // defpackage.bji
    public final List a() {
        return this.a;
    }
}
