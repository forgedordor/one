package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicConversationDataView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acna implements acng {
    public final LinearLayout a;
    public final TextView b;
    public final CheckBox c;
    public final List d = new ArrayList();
    public ConversationIdType e = barn.a;
    public SpannableString f;
    private final Context g;
    private final TextView h;

    public acna(ProblematicConversationDataView problematicConversationDataView) {
        this.g = problematicConversationDataView.getContext();
        this.a = (LinearLayout) problematicConversationDataView.findViewById(R.id.message_data_container);
        this.b = (TextView) problematicConversationDataView.findViewById(R.id.conversation_name);
        CheckBox checkBox = (CheckBox) problematicConversationDataView.findViewById(R.id.conversation_selection_checkbox);
        this.c = checkBox;
        this.h = (TextView) problematicConversationDataView.findViewById(R.id.conversation_message_count);
        problematicConversationDataView.setOnClickListener(new View.OnClickListener() { // from class: acmx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.toggle();
            }
        });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: acmy
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                acna acnaVar = this.a;
                Iterator it = acnaVar.d.iterator();
                while (it.hasNext()) {
                    ((acnh) it.next()).c.setChecked(z);
                }
                acnaVar.a();
            }
        });
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public final void a() {
        List list = this.d;
        long size = list.size();
        long jCount = Collection.EL.stream(list).filter(new Predicate() { // from class: acmz
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((acnh) obj).a();
            }
        }).count();
        if (jCount == size) {
            this.c.setChecked(true);
        }
        if (jCount == 0) {
            this.c.setChecked(false);
        }
        this.h.setText(this.g.getString(R.string.problematic_conversation_message_counter_text, Long.valueOf(jCount), Long.valueOf(size)));
    }
}
