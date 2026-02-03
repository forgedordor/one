package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.core.app.RemoteActionCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eukb {
    public final List b;
    public final Bundle c;
    private final String e;
    private final euiz f;
    private final String g;
    private static final IconCompat d = IconCompat.k(new byte[0], 0);
    static final eukb a = new eujz().a();

    public eukb(String str, List list, euiz euizVar, String str2, Bundle bundle) {
        this.e = str;
        this.b = list;
        this.f = euizVar;
        this.g = str2;
        this.c = bundle;
    }

    static eukb b(Context context, TextClassification textClassification) {
        IconCompat iconCompatG;
        textClassification.getClass();
        eujz eujzVar = new eujz();
        eujzVar.d(textClassification.getText());
        if (Build.VERSION.SDK_INT >= 28) {
            eujzVar.a = textClassification.getId();
        }
        int entityCount = textClassification.getEntityCount();
        for (int i = 0; i < entityCount; i++) {
            String entity = textClassification.getEntity(i);
            eujzVar.c(entity, textClassification.getConfidenceScore(entity));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Iterator it = textClassification.getActions().iterator();
            while (it.hasNext()) {
                eujzVar.b(RemoteActionCompat.a(akc$$ExternalSyntheticApiModelOutline0.m133m(it.next())));
            }
        } else if (textClassification.getIntent() != null && !TextUtils.isEmpty(textClassification.getLabel())) {
            PendingIntent activity = PendingIntent.getActivity(context, textClassification.getText().hashCode(), textClassification.getIntent(), 201326592);
            Drawable icon = textClassification.getIcon();
            CharSequence label = textClassification.getLabel();
            if (icon == null) {
                iconCompatG = d;
            } else {
                Drawable icon2 = textClassification.getIcon();
                if (icon2 instanceof BitmapDrawable) {
                    iconCompatG = IconCompat.g(((BitmapDrawable) icon2).getBitmap());
                } else {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    icon2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    icon2.draw(canvas);
                    iconCompatG = IconCompat.g(bitmapCreateBitmap);
                }
            }
            RemoteActionCompat remoteActionCompat = new RemoteActionCompat(iconCompatG, label, label, activity);
            remoteActionCompat.f = icon != null;
            eujzVar.b(remoteActionCompat);
        }
        return eujzVar.a();
    }

    public final int a() {
        return this.f.a().size();
    }

    public final String c() {
        return (String) this.f.a().get(0);
    }

    public final String toString() {
        return String.format(Locale.US, "TextClassification {text=%s, entities=%s, actions=%s, id=%s}", this.e, this.f, this.b, this.g);
    }
}
