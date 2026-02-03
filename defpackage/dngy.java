package defpackage;

import com.google.android.apps.messaging.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngy {
    public static final dngy a;
    public static final dngy b;
    public static final dngy c;
    public static final dngy d;
    public static final dngy e;
    public static final dngy f;
    public static final dngy g;
    public static final dngy h;
    public static final dngy i;
    public static final dngy j;
    private static final /* synthetic */ dngy[] n;
    public final ekgb k;
    public final int l;
    public final ekgb m;

    static {
        ekgb ekgbVarR = ekgb.r("android.permission.CAMERA");
        ekgbVarR.getClass();
        dngy dngyVar = new dngy("CAMERA", 0, ekgbVarR, R.string.access_camera_permission_name);
        a = dngyVar;
        ekgb ekgbVarR2 = ekgb.r("android.permission.ACCESS_FINE_LOCATION");
        ekgbVarR2.getClass();
        dngy dngyVar2 = new dngy("FINE_LOCATION", 1, ekgbVarR2, R.string.access_fine_location_permission_name);
        b = dngyVar2;
        ekgb ekgbVarR3 = ekgb.r("android.permission.READ_EXTERNAL_STORAGE");
        ekgbVarR3.getClass();
        dngy dngyVar3 = new dngy("READ_EXTERNAL_STORAGE", 2, ekgbVarR3, R.string.read_external_storage_permission_name);
        c = dngyVar3;
        ekgb ekgbVarR4 = ekgb.r("android.permission.READ_MEDIA_AUDIO");
        ekgbVarR4.getClass();
        int i2 = R.string.read_media_images_permission_name;
        dngy dngyVar4 = new dngy("READ_MEDIA_AUDIO", 3, ekgbVarR4, i2);
        d = dngyVar4;
        ekgb ekgbVarS = ekgb.s("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        ekgbVarS.getClass();
        dngy dngyVar5 = new dngy("READ_MEDIA_IMAGES", 4, ekgbVarS, i2);
        e = dngyVar5;
        ekgb ekgbVarS2 = ekgb.s("android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        ekgbVarS2.getClass();
        int i3 = R.string.read_media_videos_permission_name;
        dngy dngyVar6 = new dngy("READ_MEDIA_VIDEOS", 5, ekgbVarS2, i3);
        f = dngyVar6;
        ekgb ekgbVarR5 = ekgb.r("android.permission.RECORD_AUDIO");
        ekgbVarR5.getClass();
        dngy dngyVar7 = new dngy("RECORD_AUDIO", 6, ekgbVarR5, R.string.record_audio_permission_name);
        g = dngyVar7;
        ekgb ekgbVarR6 = ekgb.r("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        ekgbVarR6.getClass();
        ekgb ekgbVarS3 = ekgb.s("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO");
        ekgbVarS3.getClass();
        dngy dngyVar8 = new dngy("READ_MEDIA_VISUAL_USER_SELECTED", 7, ekgbVarR6, R.string.read_media_images_permission_name, ekgbVarS3);
        h = dngyVar8;
        ekgb ekgbVarR7 = ekgb.r("android.permission.READ_MEDIA_IMAGES");
        ekgbVarR7.getClass();
        dngy dngyVar9 = new dngy("FULL_READ_MEDIA_IMAGES", 8, ekgbVarR7, i2);
        i = dngyVar9;
        ekgb ekgbVarR8 = ekgb.r("android.permission.READ_MEDIA_VIDEO");
        ekgbVarR8.getClass();
        dngy dngyVar10 = new dngy("FULL_READ_MEDIA_VIDEOS", 9, ekgbVarR8, i3);
        j = dngyVar10;
        dngy[] dngyVarArr = {dngyVar, dngyVar2, dngyVar3, dngyVar4, dngyVar5, dngyVar6, dngyVar7, dngyVar8, dngyVar9, dngyVar10};
        n = dngyVarArr;
        fczb.a(dngyVarArr);
    }

    private dngy(String str, int i2, ekgb ekgbVar, int i3, ekgb ekgbVar2) {
        this.k = ekgbVar;
        this.l = i3;
        this.m = ekgbVar2;
    }

    public static dngy[] values() {
        return (dngy[]) n.clone();
    }

    public /* synthetic */ dngy(String str, int i2, ekgb ekgbVar, int i3) {
        this(str, i2, ekgbVar, i3, ekoe.a);
    }
}
