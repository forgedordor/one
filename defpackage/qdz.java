package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdz extends pfc {
    public final /* synthetic */ WorkDatabase_Impl a;

    public qdz(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
    }

    @Override // defpackage.pfc
    public final pfd a(pjo pjoVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new pij("work_spec_id", "TEXT", true, 1, null, 1));
        map.put("prerequisite_id", new pij("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new pik("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new pik("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new pil("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new pil("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        pim pimVar = new pim("Dependency", map, hashSet, hashSet2);
        pim pimVarA = pim.a(pjoVar, "Dependency");
        if (!pip.f(pimVar, pimVarA)) {
            return new pfd(false, a.i(pimVarA, pimVar, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", "\n Found:\n"));
        }
        HashMap map2 = new HashMap(33);
        map2.put("id", new pij("id", "TEXT", true, 1, null, 1));
        map2.put("state", new pij("state", "INTEGER", true, 0, null, 1));
        map2.put("worker_class_name", new pij("worker_class_name", "TEXT", true, 0, null, 1));
        map2.put("input_merger_class_name", new pij("input_merger_class_name", "TEXT", true, 0, null, 1));
        map2.put("input", new pij("input", "BLOB", true, 0, null, 1));
        map2.put("output", new pij("output", "BLOB", true, 0, null, 1));
        map2.put("initial_delay", new pij("initial_delay", "INTEGER", true, 0, null, 1));
        map2.put("interval_duration", new pij("interval_duration", "INTEGER", true, 0, null, 1));
        map2.put("flex_duration", new pij("flex_duration", "INTEGER", true, 0, null, 1));
        map2.put("run_attempt_count", new pij("run_attempt_count", "INTEGER", true, 0, null, 1));
        map2.put("backoff_policy", new pij("backoff_policy", "INTEGER", true, 0, null, 1));
        map2.put("backoff_delay_duration", new pij("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        map2.put("last_enqueue_time", new pij("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        map2.put("minimum_retention_duration", new pij("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        map2.put("schedule_requested_at", new pij("schedule_requested_at", "INTEGER", true, 0, null, 1));
        map2.put("run_in_foreground", new pij("run_in_foreground", "INTEGER", true, 0, null, 1));
        map2.put("out_of_quota_policy", new pij("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        map2.put("period_count", new pij("period_count", "INTEGER", true, 0, "0", 1));
        map2.put("generation", new pij("generation", "INTEGER", true, 0, "0", 1));
        map2.put("next_schedule_time_override", new pij("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        map2.put("next_schedule_time_override_generation", new pij("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        map2.put("stop_reason", new pij("stop_reason", "INTEGER", true, 0, "-256", 1));
        map2.put("trace_tag", new pij("trace_tag", "TEXT", false, 0, null, 1));
        map2.put("backoff_on_system_interruptions", new pij("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        map2.put("required_network_type", new pij("required_network_type", "INTEGER", true, 0, null, 1));
        map2.put("required_network_request", new pij("required_network_request", "BLOB", true, 0, "x''", 1));
        map2.put("requires_charging", new pij("requires_charging", "INTEGER", true, 0, null, 1));
        map2.put("requires_device_idle", new pij("requires_device_idle", "INTEGER", true, 0, null, 1));
        map2.put("requires_battery_not_low", new pij("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        map2.put("requires_storage_not_low", new pij("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        map2.put("trigger_content_update_delay", new pij("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        map2.put("trigger_max_content_delay", new pij("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        map2.put("content_uri_triggers", new pij("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new pil("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new pil("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        pim pimVar2 = new pim("WorkSpec", map2, hashSet3, hashSet4);
        pim pimVarA2 = pim.a(pjoVar, "WorkSpec");
        if (!pip.f(pimVar2, pimVarA2)) {
            return new pfd(false, a.i(pimVarA2, pimVar2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", "\n Found:\n"));
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new pij("tag", "TEXT", true, 1, null, 1));
        map3.put("work_spec_id", new pij("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new pik("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new pil("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        pim pimVar3 = new pim("WorkTag", map3, hashSet5, hashSet6);
        pim pimVarA3 = pim.a(pjoVar, "WorkTag");
        if (!pip.f(pimVar3, pimVarA3)) {
            return new pfd(false, a.i(pimVarA3, pimVar3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", "\n Found:\n"));
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new pij("work_spec_id", "TEXT", true, 1, null, 1));
        map4.put("generation", new pij("generation", "INTEGER", true, 2, "0", 1));
        map4.put("system_id", new pij("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new pik("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        pim pimVar4 = new pim("SystemIdInfo", map4, hashSet7, new HashSet(0));
        pim pimVarA4 = pim.a(pjoVar, "SystemIdInfo");
        if (!pip.f(pimVar4, pimVarA4)) {
            return new pfd(false, a.i(pimVarA4, pimVar4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", "\n Found:\n"));
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new pij("name", "TEXT", true, 1, null, 1));
        map5.put("work_spec_id", new pij("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new pik("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new pil("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        pim pimVar5 = new pim("WorkName", map5, hashSet8, hashSet9);
        pim pimVarA5 = pim.a(pjoVar, "WorkName");
        if (!pip.f(pimVar5, pimVarA5)) {
            return new pfd(false, a.i(pimVarA5, pimVar5, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", "\n Found:\n"));
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new pij("work_spec_id", "TEXT", true, 1, null, 1));
        map6.put("progress", new pij("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new pik("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        pim pimVar6 = new pim("WorkProgress", map6, hashSet10, new HashSet(0));
        pim pimVarA6 = pim.a(pjoVar, "WorkProgress");
        if (!pip.f(pimVar6, pimVarA6)) {
            return new pfd(false, a.i(pimVarA6, pimVar6, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", "\n Found:\n"));
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new pij("key", "TEXT", true, 1, null, 1));
        map7.put("long_value", new pij("long_value", "INTEGER", false, 0, null, 1));
        pim pimVar7 = new pim("Preference", map7, new HashSet(0), new HashSet(0));
        pim pimVarA7 = pim.a(pjoVar, "Preference");
        return !pip.f(pimVar7, pimVarA7) ? new pfd(false, a.i(pimVarA7, pimVar7, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", "\n Found:\n")) : new pfd(true, null);
    }

    @Override // defpackage.pfc
    public final void b(pjo pjoVar) {
        pjoVar.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        pjoVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        pjoVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        pjoVar.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        pjoVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        pjoVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        pjoVar.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        pjoVar.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        pjoVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        pjoVar.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        pjoVar.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        pjoVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        pjoVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        pjoVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        pjoVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }
}
