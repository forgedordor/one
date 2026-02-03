package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abl {
    private static final int a = Color.argb(230, 255, 255, 255);
    private static final int b = Color.argb(128, 27, 27, 27);

    public static /* synthetic */ void a(abi abiVar) {
        ack ackVarA = acj.a(0, 0);
        ack ackVarA2 = acj.a(a, b);
        View decorView = abiVar.getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) ackVarA.a.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = ((Boolean) ackVarA2.a.invoke(resources2)).booleanValue();
        abq abpVar = Build.VERSION.SDK_INT >= 30 ? new abp() : Build.VERSION.SDK_INT >= 29 ? new abo() : Build.VERSION.SDK_INT >= 28 ? new abn() : new abm();
        Window window = abiVar.getWindow();
        window.getClass();
        abpVar.a(ackVarA, ackVarA2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = abiVar.getWindow();
        window2.getClass();
        abpVar.b(window2);
    }
}
