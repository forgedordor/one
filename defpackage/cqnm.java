package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqnm extends ekrz {
    public cqnm() {
        super("intent", Intent.class, false);
    }

    @Override // defpackage.ekrz
    public final /* bridge */ /* synthetic */ void a(Object obj, ekry ekryVar) {
        Bundle extras;
        Intent intent = (Intent) obj;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        for (String str : extras.keySet()) {
            Object obj2 = extras.get(str);
            ekryVar.a(this.a + "." + str, obj2 == null ? "null" : cqcv.b(obj2.toString()));
        }
    }
}
