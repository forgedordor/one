package defpackage;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxb {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public kxb(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = set;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput[] a(kxb[] kxbVarArr) {
        RemoteInput[] remoteInputArr = new RemoteInput[kxbVarArr.length];
        for (int i = 0; i < kxbVarArr.length; i++) {
            kxb kxbVar = kxbVarArr[i];
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(kxbVar.a).setLabel(kxbVar.b).setChoices(kxbVar.c).setAllowFreeFormInput(kxbVar.d).addExtras(kxbVar.f);
            Iterator it = kxbVar.g.iterator();
            while (it.hasNext()) {
                builderAddExtras.setAllowDataType((String) it.next(), true);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builderAddExtras.setEditChoicesBeforeSending(kxbVar.e);
            }
            remoteInputArr[i] = builderAddExtras.build();
        }
        return remoteInputArr;
    }
}
