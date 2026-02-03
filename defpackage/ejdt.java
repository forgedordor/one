package defpackage;

import android.content.Intent;
import com.google.chat.smartmessaging.penpal.ui.EmotifyActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejdt {
    public final fcsu a;
    public final fcsu b;
    public final abvd c;

    public ejdt(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = fcsuVar3;
        Object objB = fcsuVar2.b();
        objB.getClass();
        this.c = (abvd) fdct.b((Optional) objB);
    }

    public final void a(int i, Intent intent) {
        fcsu fcsuVar = this.a;
        ((EmotifyActivity) fcsuVar.b()).setResult(i, intent);
        ((EmotifyActivity) fcsuVar.b()).finish();
    }
}
