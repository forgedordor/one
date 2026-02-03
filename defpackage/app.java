package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class app {
    public final Object a = new Object();
    public volatile boolean b = false;
    public volatile bml c;

    public app(aql aqlVar, List list) {
        int i = aqlVar.j;
        int i2 = aqlVar.j;
        Objects.toString(aqj.a(i2));
        lcg.b(i == 8, "CaptureSession state must be OPENED. Current state:".concat(aqj.a(i2)));
        DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
