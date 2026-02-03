package defpackage;

import android.graphics.Shader;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iiq {
    public static final Shader.TileMode a(int i) {
        return ikx.b(i, 0) ? Shader.TileMode.CLAMP : ikx.b(i, 1) ? Shader.TileMode.REPEAT : ikx.b(i, 2) ? Shader.TileMode.MIRROR : ikx.b(i, 3) ? Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }
}
