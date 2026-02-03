package defpackage;

import androidx.car.app.model.Alert;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffst implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public fftr a;
    public final int b;
    public int c;
    public int d;
    public boolean e = false;
    public boolean f = false;

    public ffst(int i) {
        this.b = i;
    }

    final int a() {
        return (!this.e || this.f) ? Alert.DURATION_SHOW_INDEFINITELY : this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ffst clone() {
        ffst ffstVar = new ffst(this.b);
        ffstVar.a = this.a;
        ffstVar.c = this.c;
        ffstVar.d = this.d;
        ffstVar.e = this.e;
        ffstVar.f = this.f;
        return ffstVar;
    }
}
