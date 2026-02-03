package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecyl {
    private final eusa a;

    public ecyl(exwb exwbVar) {
        eurz eurzVar = (eurz) eusa.a.createBuilder();
        eurzVar.copyOnWrite();
        eusa eusaVar = (eusa) eurzVar.instance;
        eusaVar.c = exwbVar.cL;
        eusaVar.b |= 1;
        eurzVar.copyOnWrite();
        eusa eusaVar2 = (eusa) eurzVar.instance;
        eusaVar2.e = 25;
        eusaVar2.b |= 4;
        this.a = (eusa) eurzVar.build();
    }

    public final Intent a(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.libraries.user.profile.photopicker.picker.intentonly.PhotoPickerIntentActivity");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.profile.photopicker.ACCOUNT", str);
        ProtoParsers.j(bundle, "com.google.profile.photopicker.HOST_INFO", this.a);
        intent.putExtras(bundle);
        return intent;
    }
}
