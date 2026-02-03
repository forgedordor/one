package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bgvg extends dqws {
    public bgvg(String[] strArr) {
        super("messages LEFT JOIN parts ON (parts.message_id=messages._id AND %PARTS_JOIN_TIMESTAMP_CHECK%) LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN reports_concat_view ON (reports_concat_view.message_id_read_reports=messages._id AND %REPORTS_JOIN_TIMESTAMP_CHECK%) LEFT JOIN user_refs_concat_view ON (user_refs_concat_view.message_id_user_references=messages._id) LEFT JOIN link_preview ON (link_preview.message_id=messages._id) LEFT JOIN verified_sms_senders ON (verified_sms_senders.sender_id=participants.normalized_destination) LEFT JOIN verified_sms_brands ON (verified_sms_brands.brand_id=verified_sms_senders.brand_id) LEFT JOIN conversations ON (conversations._id=messages.conversation_id) LEFT JOIN message_reactions ON (message_reactions.message_id=messages._id) LEFT JOIN file_transfer ON (file_transfer.message_id=messages._id) LEFT JOIN message_star ON (message_star.message_id=messages._id) LEFT JOIN message_photos_sharing ON (message_photos_sharing.message_id=messages._id) LEFT JOIN vmt ON (vmt.part_id=parts._id) LEFT JOIN message_replies_view ON (%REPLIES_VIEW_JOIN%) LEFT JOIN profiles_table ON (profiles_table.participant_id=participants._id) LEFT JOIN message_captions ON (message_captions.message_id=messages._id)", strArr, "messages._id", "messages.received_timestamp DESC, messages._id DESC", null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bgve b() {
        l();
        return new bgve(this.a.a());
    }

    public final void c(bgvd... bgvdVarArr) {
        D((String) DesugarArrays.stream(bgvdVarArr).map(new Function() { // from class: bgvf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bgvd) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        bgva[] bgvaVarArr = (bgva[]) function.apply(bgvl.c);
        int iIntValue = bgvl.c().intValue();
        for (bgva bgvaVar : bgvaVarArr) {
            if (((Integer) bgvl.b.getOrDefault(bgvaVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(bgvaVarArr);
    }

    public final void e(bgvk bgvkVar) {
        k(new bgvh(bgvkVar));
    }

    public final void f(Function function) {
        String[] strArr = bgvl.a;
        k(new bgvh((bgvk) function.apply(new bgvk())));
    }
}
