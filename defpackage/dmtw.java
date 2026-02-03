package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmtw extends dmiz {
    public static final /* synthetic */ int u = 0;
    private final dngc v;
    private final dmiv w;
    private final View x;
    private final View y;

    public dmtw(dngc dngcVar, View view, dmiv dmivVar) {
        super(view);
        this.v = dngcVar;
        this.w = dmivVar;
        this.x = view.findViewById(R.id.system_camera_photo_button);
        this.y = view.findViewById(R.id.system_camera_video_button);
    }

    @Override // defpackage.dmiz
    public final Object C(fcxy fcxyVar) {
        final dmiw dmiwVar = this.w.c;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: dmtu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = dmtw.u;
                view.getClass();
                dmiwVar.a(view);
            }
        };
        dngc dngcVar = this.v;
        this.x.setOnClickListener(dngcVar.a("SystemCameraPickerViewHolder.photoButton#onClick", onClickListener));
        this.y.setOnClickListener(dngcVar.a("SystemCameraPickerViewHolder.videoButton#onClick", new View.OnClickListener() { // from class: dmtv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = dmtw.u;
                view.getClass();
                dmiwVar.a(view);
            }
        }));
        return fctx.a;
    }

    @Override // defpackage.dmiz
    public final Object E() {
        return fctx.a;
    }

    @Override // defpackage.dmiz
    public final void D(dmiu dmiuVar) {
    }
}
