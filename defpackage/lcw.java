package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.view.ContentInfo;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcw {
    public final lcu a;

    public lcw(lcu lcuVar) {
        this.a = lcuVar;
    }

    public static ClipData c(ClipDescription clipDescription, List list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem((ClipData.Item) list.get(i));
        }
        return clipData;
    }

    public static lcw f(ContentInfo contentInfo) {
        return new lcw(new lct(contentInfo));
    }

    public final int a() {
        return this.a.a();
    }

    public final int b() {
        return this.a.b();
    }

    public final ClipData d() {
        return this.a.c();
    }

    public final ContentInfo e() {
        ContentInfo contentInfoF = this.a.f();
        contentInfoF.getClass();
        return contentInfoF;
    }

    public final String toString() {
        return this.a.toString();
    }
}
