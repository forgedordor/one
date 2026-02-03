package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daer implements lvj {
    public static rtj a;
    public static final ruf b;
    public final Context c;
    TextView d;
    TextView e;
    TextView f;
    ImageView g;
    cpdw h;
    private final lvc i;
    private final dagf j;
    private dacs k;

    static {
        rue rueVar = new rue();
        rueVar.b();
        b = rueVar.a();
    }

    public daer(Context context, lvc lvcVar, dagf dagfVar) {
        this.c = context;
        this.i = lvcVar;
        this.j = dagfVar;
    }

    @Override // defpackage.lvj
    public final lvc P() {
        return this.i;
    }

    final void a(View view) {
        this.d = (TextView) view.findViewById(R.id.zero_state_search_location_street_level_address);
        this.e = (TextView) view.findViewById(R.id.zero_state_search_location_city_level_address);
        this.f = (TextView) view.findViewById(R.id.zero_state_search_location_sender_and_date);
        this.g = (ImageView) view.findViewById(R.id.zero_state_search_location_image);
        dagf dagfVar = this.j;
        this.h = new cpdw(view, dagfVar.a(), dagfVar.a());
    }

    public final void b(dacs dacsVar) {
        c();
        this.k = dacsVar;
        this.j.b(this.h, dacsVar.o());
        lvv lvvVarD = dacsVar.d();
        final TextView textView = this.d;
        textView.getClass();
        lvvVarD.f(this, new lvz() { // from class: daep
            @Override // defpackage.lvz
            public final void a(Object obj) {
                textView.setText((String) obj);
            }
        });
        lvv lvvVarA = dacsVar.a();
        final TextView textView2 = this.e;
        textView2.getClass();
        lvvVarA.f(this, new lvz() { // from class: daep
            @Override // defpackage.lvz
            public final void a(Object obj) {
                textView2.setText((String) obj);
            }
        });
        lvv lvvVarC = dacsVar.c();
        final TextView textView3 = this.f;
        textView3.getClass();
        lvvVarC.f(this, new lvz() { // from class: daep
            @Override // defpackage.lvz
            public final void a(Object obj) {
                textView3.setText((String) obj);
            }
        });
        dacsVar.b().f(this, new lvz() { // from class: daeq
            @Override // defpackage.lvz
            public final void a(Object obj) {
                dacr dacrVar = (dacr) obj;
                Bitmap bitmap = dacrVar.b;
                String str = dacrVar.a;
                if (str != null) {
                    daer daerVar = this.a;
                    Context context = daerVar.c;
                    rbr rbrVarI = raw.c(context).i(str);
                    if (daer.a == null) {
                        daer.a = (rtj) rtj.a().R(R.drawable.zero_state_search_location_map_placeholder_card);
                    }
                    rbrVarI.q(daer.a).p(rqi.c(daer.b)).d(raw.c(context).e(context.getDrawable(R.drawable.zero_state_search_location_map_placeholder_card))).v(daerVar.g);
                }
            }
        });
    }

    public final void c() {
        dacs dacsVar = this.k;
        if (dacsVar != null) {
            dacsVar.d().l(this);
            dacsVar.a().l(this);
            dacsVar.b().l(this);
            dacsVar.c().l(this);
            this.k = null;
            lvn lvnVar = (lvn) this.i;
            if (!lvnVar.c.a(lvb.c) || lvnVar.c.equals(lvb.a)) {
                return;
            }
            this.d.setText("");
            this.e.setText("");
            this.f.setText("");
            Context context = this.c;
            rbv rbvVarC = raw.c(context);
            rbvVarC.w(rtj.a());
            rbvVarC.e(context.getDrawable(R.drawable.zero_state_search_location_map_placeholder_card)).v(this.g);
        }
    }
}
