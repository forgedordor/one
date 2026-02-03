package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daeg extends cvjb {
    public final dagf A;
    public boolean B;
    public final Context t;
    public final View u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final ImageView y;
    public final cpdw z;

    public daeg(Context context, lvj lvjVar, View view, dagf dagfVar) {
        super(lvjVar.P(), view);
        this.B = false;
        this.t = context;
        this.A = dagfVar;
        this.u = view;
        this.v = (TextView) view.findViewById(R.id.zero_state_search_link_title);
        this.x = (TextView) view.findViewById(R.id.zero_state_search_link_sender_and_date);
        this.w = (TextView) view.findViewById(R.id.zero_state_search_link_sub_title);
        this.y = (ImageView) view.findViewById(R.id.zero_state_search_link_image);
        this.z = new cpdw(view, dagfVar.a(), dagfVar.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cvjb
    protected final /* bridge */ /* synthetic */ void E(Object obj) {
        obj.p();
        this.A.b(this.z, obj.q());
        D(obj.f(), new lvz() { // from class: daeb
            @Override // defpackage.lvz
            public final void a(Object obj2) {
                this.a.v.setText((String) obj2);
            }
        });
        D(obj.b(), new lvz() { // from class: daec
            @Override // defpackage.lvz
            public final void a(Object obj2) {
                this.a.w.setText((String) obj2);
            }
        });
        D(obj.e(), new lvz() { // from class: daed
            @Override // defpackage.lvz
            public final void a(Object obj2) {
                this.a.x.setText((String) obj2);
            }
        });
        D(obj.e(), new lvz() { // from class: daee
            @Override // defpackage.lvz
            public final void a(Object obj2) {
                this.a.x.setText((String) obj2);
            }
        });
        D(obj.c(), new lvz() { // from class: daef
            @Override // defpackage.lvz
            public final void a(Object obj2) {
                daeg daegVar = this.a;
                Uri uri = (Uri) obj2;
                if (daegVar.B && uri == null) {
                    ImageView imageView = daegVar.y;
                    raw.e(imageView).e(daegVar.t.getResources().getDrawable(R.drawable.zero_state_search_link_icon_placeholder_card)).v(imageView);
                    daegVar.B = false;
                    return;
                }
                if (uri != null) {
                    ImageView imageView2 = daegVar.y;
                    raw.e(imageView2).f(uri).p(rqi.c(daeh.h)).q(rtj.a().R(R.drawable.zero_state_search_link_icon_placeholder_card)).v(imageView2);
                    daegVar.B = true;
                }
            }
        });
    }
}
