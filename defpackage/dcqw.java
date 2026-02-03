package defpackage;

import android.content.Context;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcqw {
    public final Object a;

    public dcqw(Class cls, Context context, Parcelable parcelable) throws dcqt {
        try {
            this.a = cls.getDeclaredConstructor(Context.class, Parcelable.class).newInstance(context, parcelable);
        } catch (Exception e) {
            throw new dcqt(e);
        }
    }
}
