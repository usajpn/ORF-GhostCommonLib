package jp.ac.keio.sfc.ht.memsys.ghost.commonlib.tasks;

import jp.ac.keio.sfc.ht.memsys.ghost.commonlib.tasks.OffloadableTask;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Created by aqram on 10/2/14.
 * TODO
 */
public class OffloadableTaskPipeline {

    private LinkedList<OffloadableTask> mPipeline;
    public final String ADDRESS;
    public final String APPNAME;

    public OffloadableTaskPipeline(String address, String appname){
        mPipeline = new LinkedList<OffloadableTask>();
        ADDRESS = address;
        APPNAME = appname;
    }

    public void addTask(OffloadableTask t){
        mPipeline.push(t);
    }

    public OffloadableTask fetchTask(){
        return mPipeline.pollFirst();
    }
}
