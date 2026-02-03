package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiiw {
    private final Intent a = new Intent();

    private aiiw() {
    }

    public static aiiw b(ComponentName componentName, String str) {
        aiiw aiiwVar = new aiiw();
        aiiwVar.a.setComponent(componentName);
        aiiwVar.e(str);
        return aiiwVar;
    }

    public static aiiw c(Context context, Class cls, String str) {
        aiiw aiiwVar = new aiiw();
        aiiwVar.a.setClass(context, cls);
        aiiwVar.e(str);
        return aiiwVar;
    }

    public static aiiw d(String str) {
        aiiw aiiwVar = new aiiw();
        aiiwVar.e(str);
        return aiiwVar;
    }

    public final Intent a() {
        return (Intent) this.a.clone();
    }

    public final void e(String str) {
        ejwl.b(!str.isEmpty(), "The action of intent should not be set to empty. (go/responsible-api-intent-issues)");
        this.a.setAction(str);
    }

    public final void f(String str) {
        ejwl.b(!str.isEmpty(), "The package of intent should not be set to empty.");
        this.a.setPackage(str);
    }
}
